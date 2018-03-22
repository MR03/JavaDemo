package pw.mr03.oktalia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.mapper.AdminMapper;
import pw.mr03.oktalia.mapper.TestMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class AdminService implements AdminMapper {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getById(Integer id) {
        return adminMapper.getById(id);
    }
}
