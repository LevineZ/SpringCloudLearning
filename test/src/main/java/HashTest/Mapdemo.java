package HashTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/2 15:20
 */

public class Mapdemo {
    public static final Map<String, Integer> map = new HashMap<>();
    static{
        map.put("ali", 1);
        map.put("qcloud", 2);
        map.put("qcloudswqwq", 2);
        map.put("qxzxcloud", 0);
        map.put("qclxzxzozxzud", 2);
    }

    public static void main(String[] args) {
        Map<String, Integer> ipServerMap = new ConcurrentHashMap<>();
        ipServerMap.putAll(map);

        Set<String> ipset = ipServerMap.keySet();

        ArrayList<String> iplist = new ArrayList<>();
        iplist.addAll(ipset);
        System.out.println(iplist);


    }


}