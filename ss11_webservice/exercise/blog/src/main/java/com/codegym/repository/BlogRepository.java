package com.codegym.repository;

import com.codegym.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Query(value = "select * from Blog where id_c=:id_c", nativeQuery = true)
    List<Blog> find(@Param("id_c") int id);


}

