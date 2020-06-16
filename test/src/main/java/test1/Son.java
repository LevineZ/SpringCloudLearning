package test1;

import java.util.Collection;
import java.util.Map;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/16 15:30
 */

public class Son extends Father {
    public Collection dosomething(Map map) {
        System.out.printf("子类被执行");
        return map.values();
    }
}