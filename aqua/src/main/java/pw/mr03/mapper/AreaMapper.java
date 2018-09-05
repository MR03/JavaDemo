package pw.mr03.mapper;

import org.springframework.stereotype.Repository;
import pw.mr03.entity.Area;

/**
 * Created by Administrator on 2017/12/29.
 */

@Repository
public interface AreaMapper {
    boolean insertAreaCell(Area area);
}
