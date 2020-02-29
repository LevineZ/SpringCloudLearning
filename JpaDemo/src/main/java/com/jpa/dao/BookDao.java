package com.jpa.dao;

import com.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {
    Book findBookById(Integer id);

    List<Book> findBookByIdGreaterThan(Integer id);
    List<Book> findBookByIdLessThan(Integer id);

    List<Book> findBookByIdLessThanOrNameContaining(Integer id, String name);

    /**
     * 自定义查询
     * @return
     */
    @Query(value = "select * from t_book where id=(select max(id) from t_book)", nativeQuery = true)
    Book getMaxIdBook();

    /**
     * 自定义插入1
     * @param name
     * @param auther
     * @return
     */
    @Query(value = "insert into t_book(name,auther) values(?1,?2)", nativeQuery = true)
    @Modifying
    @Transactional
    Integer addBook1(String name, String auther);

    /**
     * 自定义插入2
     *
     * @param name
     * @param auther
     * @return
     */
    @Query(value = "insert into t_book(name,auther) values(:name,:auther)", nativeQuery = true)
    @Modifying
    @Transactional
    Integer addBook2(@Param("name") String name, @Param("auther") String auther);


}
