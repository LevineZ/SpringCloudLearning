package exTest;

import java.util.*;

public class OverDraftException extends Exception{

    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverDraftException(String msg, double deficit) {
        super(msg);
        this.deficit = deficit;
    }

    public static void main(String[] args) {
        HashSet<Integer> numberSet1 =new HashSet<Integer>();
        //HashSet中的数据不是按照插入顺序存放
        numberSet1.add(88);
        numberSet1.add(888);
        numberSet1.add(8);
        numberSet1.add(7);
        numberSet1.add(6);
        numberSet1.add(5);
        numberSet1.add(4);
        numberSet1.add(3);
        numberSet1.add(2);

        System.out.println(numberSet1);

        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet中的数据是按照插入顺序存放
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
        numberSet2.add(8881);
        numberSet2.add(8882);
        numberSet2.add(8883);
        numberSet2.add(8884);
        numberSet2.add(8885);
        numberSet2.add(8886);
        numberSet2.add(8887);

        System.out.println(numberSet2);
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);

        System.out.println(numberSet3);

    }

}