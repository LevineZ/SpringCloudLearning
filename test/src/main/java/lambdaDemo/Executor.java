package lambdaDemo;

/**
 * @Author: zhouhuan
 * @Date: 2020/9/1 15:34
 */

@FunctionalInterface
public interface Executor {
    void execute(Person person);
}
