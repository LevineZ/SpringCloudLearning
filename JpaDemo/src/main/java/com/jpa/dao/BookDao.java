package com.jpa.dao;

import com.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

public interface BookDao extends JpaRepository<Book, Integer> {
    Book findBookById(Integer id);

    List<Book> findBookByIdGreaterThan(Integer id);

    List<Book> findBookByIdLessThan(Integer id);

    List<Book> findBookByIdLessThanOrNameContaining(Integer id, String name);

    /**
     * 自定义查询
     *
     * @return
     */
    @Query(value = "select * from t_book where id=(select max(id) from t_book)", nativeQuery = true)
    Book getMaxIdBook();

    /**
     * 自定义插入1
     *
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


    /**
     * 自定义插入3
     *
     * @param name
     * @param auther
     * @return
     */
    @Query(value = "insert into t_book(name,auther) values(:name,:auther)", nativeQuery = true)
    @Modifying
    @Transactional
    Integer addBook3(@Param("name") String name, @Param("auther") String auther);


    /**
     * 自定义更新
     *
     * @param name
     * @param auther
     * @return
     */
    @Query(value = "update t_book set name=:name,auther=:auther where id=3", nativeQuery = true)
    @Modifying
    @Transactional
    Integer updateBook(@Param("name") String name, @Param("auther") String auther);


//    /**
//     * 自定义更新2
//     *
//     * @param name
//     * @param auther
//     * @return
//     */
//    @Query(value = "update t_book set name=:name,auther=:auther,sendTime=:sendTime where name=:name and auther=:auther", nativeQuery = true)
//    @Modifying
//    @Transactional
//    Integer updateBook2(@Param("name") String name, @Param("sendTime") String sendTime, @Param("auther") String auther);


    @Query(value = "replace into t_book (id,name,auther)values(5,:name,:auther)", nativeQuery = true)
    @Modifying
    @Transactional
    Integer updateBook3(@Param("name") String name, @Param("auther") String auther);



}
