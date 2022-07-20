package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BlogRepository extends JpaRepository<Blog,Integer> {

    @Modifying
    @Query(value = "update  Blog  set day =:day," + "set name=:name," + "set status=:status where  id=:id", nativeQuery = true)
    void update(@Param("day") String day, @Param("name") String name, @Param("status") String status, @Param("id") int id);
}

