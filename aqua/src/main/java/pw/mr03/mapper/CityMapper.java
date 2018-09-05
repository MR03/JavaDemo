package pw.mr03.mapper;

import org.springframework.stereotype.Repository;
import pw.mr03.entity.City;

/**
 * Created by Administrator on 2017/12/29.
 */

@Repository
public interface CityMapper {
    boolean insertCityCell(City city);
}
