package pw.mr03.oktalia.mapper;

import pw.mr03.oktalia.entity.Admin;
import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface AdminMapper {

    List<Admin> getById(Integer id);

    List<Admin> getByTest(String mobile);
}
