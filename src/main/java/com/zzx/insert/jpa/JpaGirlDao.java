package com.zzx.insert.jpa;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface JpaGirlDao extends JpaRepository<Girl, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM  girl where girl.age=?1")
    List<Girl> findByAge(int age);

    @Transactional
    @Modifying
    @Query("update Girl set high=?2 where age=?1")
    int updateGirl(int age, int high);


    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "delete from  girl  where age=?1")
//    @Query("delete from  Girl  where age=?1")
    int deleteByAge(int age);

    @Transactional
    @Modifying
    @Query(nativeQuery = true, value = "insert into girl (age, high)  values (?1,?2)")
    int addGirl(int age, int high);
}
