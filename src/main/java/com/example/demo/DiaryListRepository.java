package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @github: http://github.com/sonanDev
 * @createdBy: jindam91@gmail.com
 * @created: 2020/06/20
 * @since: 1.8
 */
public interface DiaryListRepository extends JpaRepository<Diary, Long> {

    List<Diary> findByUser(String user);
}
