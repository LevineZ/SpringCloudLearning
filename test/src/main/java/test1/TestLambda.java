package test1;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class TestLambda {
    public static void main(String[] args) {
        Random r = new Random();
        List<Hero> heros = new ArrayList<Hero>();
        for (int i = 0; i < 10; i++) {
            heros.add(new Hero("hero " + i, r.nextInt(1000), r.nextInt(100)));
        }
        System.out.println("初始化后的集合：");
        System.out.println(heros);
        System.out.println("筛选出 hp>100 && damange<50的英雄");
        filter(heros);
        //filter(heros,h->h.hp>100 && h.damage<50);
    }

    private static void filter(List<Hero> heros) {
        for (Hero hero : heros) {
            if(hero.hp>100 && hero.damage<50)
                System.out.print(hero);
        }
    }
    /**
     * private static void filter(List<Hero> heros,HeroChecker checker) {
     *         for (Hero hero : heros) {
     *             if(checker.test(hero))
     *                 System.out.print(hero);
     *         }
     */

}
