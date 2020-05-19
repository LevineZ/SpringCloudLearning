package generic;



public class GenericTest<T> {
    private T name;
    private T male;
    private T age;
    public void setName(T name) {
        this.name = name;
    }

    public void setMale(T male) {
        this.male = male;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    public static void main(String[] args) {
        GenericTest<String> test = new GenericTest<>();
        test.setMale("man");
        test.setName("Levine");

        GenericTest<Integer> test1 = new GenericTest<>();
        test1.setAge(18);

        System.out.println(test.getClass());
        System.out.println(test1.getClass());
        System.out.println(test.getClass() == test1.getClass());

    }
}