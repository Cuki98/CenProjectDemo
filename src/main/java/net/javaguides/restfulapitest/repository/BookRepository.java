package net.javaguides.restfulapitest.repository;

import net.javaguides.restfulapitest.model.Author;
import net.javaguides.restfulapitest.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> findByAuthorId(Long authorId);



}
