package com.codegym.repository;

import com.codegym.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookRepository extends JpaRepository<Book, Integer> {
    @Modifying
    @Query(value = "update book set count = count - 1 where id = :id", nativeQuery = true)
    int getBook(@Param("id") int id);

    @Modifying
    @Query(value = "update book set count = count + 1 where id = :id", nativeQuery = true)
    int returnBook(@Param("id") int id);
}
