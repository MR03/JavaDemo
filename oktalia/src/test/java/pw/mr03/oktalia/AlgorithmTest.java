package pw.mr03.oktalia;

import demo.Meta;
import demo.MyAnno;
import org.junit.Test;

/**
 * Created by Administrator on 2018/3/23.
 */

public class AlgorithmTest {
    @Test
    public void contextLoads() {
        Meta meta = new Meta();
        Class<? extends Meta> aClass = meta.getClass();
        MyAnno annotation = aClass.getAnnotation(MyAnno.class);
        System.out.println(annotation.str());
    }
}
