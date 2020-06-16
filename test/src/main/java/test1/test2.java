package test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: zhouhuan
 * @Date: 2020/5/20 14:59
 */

public class test2 {
    public static void main(String[] args) {
        String s = "abcdef";
        s = s.substring(0, 3);
        System.out.println(s);

        Map<String, String> map = new HashMap<>();
        map.put("name", "levine");
        map.put("name1", "zhouhuan");
        map.put("邓超", "孙俪");
        map.put("李晨", "范冰冰");
        map.put("刘德华", "柳岩");

        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        //遍历Set集合
        Iterator<Map.Entry<String,String>> it =entrySet.iterator();
        while(it.hasNext()){
            //得到每一对对应关系
            Map.Entry<String,String> entry = it.next();
            //通过每一对对应关系获取对应的key
            String key = entry.getKey();
            //通过每一对对应关系获取对应的value
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println(map);

    }
}