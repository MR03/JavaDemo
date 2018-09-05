package pw.mr03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.entity.Province;
import pw.mr03.mapper.ProvinceMapper;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class ProvinceService {

    @Autowired
    private ProvinceMapper provinceMapper;

    public boolean insertProvinceCell(Province province) {
        return provinceMapper.insertProvinceCell(province);
    }
}
