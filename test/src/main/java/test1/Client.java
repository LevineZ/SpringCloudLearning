package test1;

import java.util.HashMap;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/16 15:35
 */

public class Client {
    public static void invoker() {
        Son father = new Son();
        HashMap map = new HashMap();
        father.dosomething(map);
    }

    public static void main(String[] args) {
        invoker();
    }
}