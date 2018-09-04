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
public class TestService {

    @Autowired
    private TestMapper testMapper;

    public Test selectOrderCellById(int id) {
        return testMapper.selectOrderCellById(id);
    }
}
