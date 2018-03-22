package pw.mr03.oktalia.mapper;



import pw.mr03.oktalia.entity.Test;
import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface TestMapper {

    List<Test> getById(final Integer id);
}
