package pw.mr03.mapper;

import org.springframework.stereotype.Repository;
import pw.mr03.entity.Admin;

/**
 * Created by Administrator on 2017/12/29.
 */

@Repository
public interface AdminMapper {
    boolean insertAdmin(Admin admin);
}
