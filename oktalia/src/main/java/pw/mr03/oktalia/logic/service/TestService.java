package pw.mr03.oktalia.logic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.oktalia.entity.Test;
import pw.mr03.oktalia.mapper.TestMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class TestService implements TestMapper {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> getById(int id) {
        return testMapper.getById(id);
    }
}
