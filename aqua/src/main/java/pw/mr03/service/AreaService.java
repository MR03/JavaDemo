package pw.mr03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.entity.Area;
import pw.mr03.mapper.AreaMapper;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class AreaService {

    @Autowired
    private AreaMapper areaMapper;

    public boolean insertAreaCell(Area area) {
        return areaMapper.insertAreaCell(area);
    }
}
