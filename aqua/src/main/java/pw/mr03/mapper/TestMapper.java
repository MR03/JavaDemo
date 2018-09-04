package pw.mr03.mapper;

import org.springframework.stereotype.Repository;
import pw.mr03.entity.Test;

/**
 * Created by Administrator on 2017/12/29.
 */

@Repository
public interface TestMapper {
    Test selectOrderCellById(int id);
}
