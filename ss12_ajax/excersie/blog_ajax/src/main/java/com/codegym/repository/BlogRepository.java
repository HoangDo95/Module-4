package com.codegym.repository;

import com.codegym.model.Blog;
import com.codegym.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    Page<Blog> findByNameContaining(String name, Pageable pageable);

//    @Modifying
//    @Query(value = "update  Blog  set day =:day, name=:name, category=:category, status=:status where id=:id", nativeQuery = true)
//    void update(@Param("day") String day, @Param("name") String category, @Param("category") String name, @Param("status") String status, @Param("id") int id);
}

