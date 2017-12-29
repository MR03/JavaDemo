package pw.mr03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.entity.Test;
import pw.mr03.mapper.TestMapper;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class TestService implements TestMapper {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Test> getById(Integer id) {
        return testMapper.getById(id);
    }
}
