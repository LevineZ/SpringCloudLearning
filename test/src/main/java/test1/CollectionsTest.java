package test1;

import java.util.*;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/9 10:36
 */

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(32);
        list.add(33);
        list.add(55);
//将集合按照默认的规则排序,按照数字从小到大的顺序排序
        Collections.sort(list);
        System.out.println("list = " + list);
        System.out.println("===================");
//将集合中的元素反转
        Collections.reverse(list);
        System.out.println("list = " + list);
//addAll方法可以往集合中添加元素，也可往集合中添加一个集合
        Collections.addAll(list,19,20,67);
//打乱集合中的元素
        Collections.shuffle(list);
        System.out.println("list = " + list);

//Arrays.asList方法可以返回一个长度内容固定的List集合
        List<String> list2 = Arrays.asList("tom", "kobe", "jordan", "tracy","westbook","yaoming","ace","stephen");
//按照字符串首字符的升序排列
        Collections.sort(list2);
        System.out.println("list2 = " + list2);
//这里是是使用匿名内部类来完成的
        Collections.sort(list2, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //指定比较规则，按照首字母降序来排列
                return o2.charAt(0)-o1.charAt(0);
            }
        });
        System.out.println("list2 = " + list2);
//这里是使用lambda表达式来完成
        Collections.sort(list2,(o1,o2)->{ return o2.charAt(o2.length()-1)-o1.charAt(o1.length()-1);});
    }

}