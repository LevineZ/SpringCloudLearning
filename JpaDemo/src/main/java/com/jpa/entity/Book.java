package com.jpa.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "t_book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    private String auther;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuther() {
        return auther;
    }



    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", auther='" + auther + '\'' +
                '}';
    }
}
