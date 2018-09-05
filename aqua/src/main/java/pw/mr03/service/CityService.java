package pw.mr03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.entity.City;
import pw.mr03.mapper.CityMapper;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public boolean insertCityCell(City city) {
        return cityMapper.insertCityCell(city);
    }
}
