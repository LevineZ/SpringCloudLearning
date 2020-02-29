package com.jpa;

import com.jpa.dao.BookDao;
import com.jpa.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    public void contextLoads() {
        //Book book = new Book();
        for (int i = 0; i < 10; i++) {
            Book book = new Book();
            book.setName("啦啦啦啦"+i);
            book.setAuther("哈哈哈哈"+i);
            bookDao.save(book);
        }
    }

    @Test
    public void update() {
        Book book = new Book();
        book.setAuther("周欢");
        book.setName("SpringCloudLearning");
        book.setId(1);
        bookDao.saveAndFlush(book);
    }

    @Test
    public void delete() {
        bookDao.deleteById(2);

    }

    @Test
    public void find1() {
        Optional<Book> byId = bookDao.findById(2);
        System.out.println(byId.get());
        List<Book> all = bookDao.findAll();
        System.out.println(all);
    }

    @Test
    public void find2() {
        //List<Book> list = bookDao.findAll(new Sort(Sort.Direction.DESC, "id"));
        //List<Book> list = bookDao.findAll(new Sort(Sort.Direction.DESC, "id"));
       // System.out.println(list);

    }

    @Test
    public void find3() {
        Pageable pageable = PageRequest.of(0, 3);
        Page<Book> page = bookDao.findAll(pageable);
        System.out.println("总记录数：" + page.getTotalElements());
        System.out.println("当前页记录数" + page.getNumberOfElements());
        System.out.println("每页记录数：" + page.getSize());
        System.out.println("获取总页数" + page.getTotalPages());
        System.out.println("查询结果" + page.getContent());
        System.out.println("当前页（从0开始）：" + page.getNumber());
        System.out.println("是否为首页：" + page.isFirst());
        System.out.println("是否为尾页：" + page.isLast());

    }


    @Test
    public void find4() {
        Book book = bookDao.findBookById(3);
        System.out.println(book);
    }


    @Test
    public void find5() {
        List<Book> list = bookDao.findBookByIdGreaterThan(3);
        System.out.println(list);

        List<Book> list1 = bookDao.findBookByIdLessThanOrNameContaining(3, "SpringCloudLearnig");
        System.out.println(list1);

    }

    @Test
    public void find6() {
        Book book = bookDao.getMaxIdBook();
        System.out.println(book);

    }

    @Test
    public void find7() {
        Integer addBook1 = bookDao.addBook1("Levine", "SpringCloudLearning");
        System.out.println(addBook1);

        Integer addBook2 = bookDao.addBook2("Michael", "SpringData");
        System.out.println(addBook2);

    }

}
