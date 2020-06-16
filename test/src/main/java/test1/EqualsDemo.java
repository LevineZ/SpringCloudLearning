package test1;

import java.util.HashSet;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/10 16:03
 */

public class EqualsDemo {
    public static class User {
        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            //如果是同一个对象返回true，反之返回false
            if (this == obj) {
                return true;
            }
            //判断类型相同
            if (this.getClass() != obj.getClass()) {
                return false;
            }

            User user = (User) obj;
            return name.equals(user.name) && age == user.age;
        }

        @Override
         public int hashCode(){
            int nameHash =  name.toUpperCase().hashCode();
            return nameHash ^ age ;
         }
    }


    public static void main(String[] args) {
        User user1 = new User("levine", 18);
        User user2 = new User("levine", 18);
        User user3 = new User("beijing", 100);
        User user4 = new User("Levine", 18);

        HashSet set = new HashSet();
        set.add(user1);
        set.add(user2);
        set.add(user3);


        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user4));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user4.hashCode());

        System.out.println(set.toString());

    }
}