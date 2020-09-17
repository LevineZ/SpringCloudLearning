package lambdaDemo;

/**
 * @Author: zhouhuan
 * @Date: 2020/9/1 15:33
 */

@FunctionalInterface
public interface NameChecker {
    boolean check(Person person);
}
