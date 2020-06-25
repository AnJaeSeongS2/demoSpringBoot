package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 일기를 나타내는 엔티티.
 * POJO객체이다.
 * Entity annotation으로 class를 JPA엔티티로 지정.
 * id field는 Id aanotation, GeneratedValue annotation으로 엔티티의 유일성 식별, 자동으로 값을 제공하는 필드로 지정됨.
 *
 * @github: http://github.com/sonanDev
 * @createdBy: jindam91@gmail.com
 * @created: 2020/06/20
 * @since: 1.8
 */
@Entity
public class Diary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String user;
    private String title;
    private String content;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
