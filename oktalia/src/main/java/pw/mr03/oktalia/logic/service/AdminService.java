package pw.mr03.oktalia.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.request.RegisterAdminReq;
import pw.mr03.oktalia.mapper.AdminMapper;
import pw.mr03.oktalia.request.SignInReq;
import pw.mr03.oktalia.utils.algorithm.AES;
import pw.mr03.oktalia.utils.algorithm.MD5;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class AdminService implements AdminMapper {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * 添加一个新管理员
     */
    @Override
    public int addAdmin(RegisterAdminReq req) {
        // aes加密并进行md5计算
        String pwd = MD5.GetMD5Code(AES.GetAESCode(req.getPwd()), true);
        req.setPwd(pwd);
        return adminMapper.addAdmin(req);
    }

    @Override
    public Admin getAdmin(String mobile) {
        return adminMapper.getAdmin(mobile);
    }

    public boolean login(SignInReq req, Admin admin) {
        String pwd = MD5.GetMD5Code(AES.GetAESCode(req.getPwd()), true);
        if (pwd.equals(admin.getPwd())) {
            return true;
        } else {
            return false;
        }
    }
}
