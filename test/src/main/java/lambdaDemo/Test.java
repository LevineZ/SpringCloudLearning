package lambdaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @Author: zhouhuan
 * @Date: 2020/6/16 19:27
 */

public class Test {
    List<Person> guilttyPerson = Arrays.asList(
            new Person("zhou", "huan", 25),
            new Person("zhao", "huan", 25),
            new Person("dong", "huan", 25)
    );

    //打印出guiltyPersons List里面所有LastName以"Z"开头的人的FirstName。

    public static void checkAndExecute(List<Person> personList,
                                       NameChecker nameChecker,
                                       Executor executor) {
        for (Person p : personList) {
            if (nameChecker.check(p)) {
                executor.execute(p);
            }
        }
        personList.forEach(person -> {
            if (nameChecker.check(person)) {
                executor.execute(person);
            }});

        Stream
    }
}