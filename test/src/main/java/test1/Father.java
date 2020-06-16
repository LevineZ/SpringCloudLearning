package test1;

import java.util.Collection;
import java.util.HashMap;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/16 15:28
 */

public class Father {
    public Collection dosomething(HashMap map) {
        System.out.printf("父类被执行");
        return map.values();
    }

}