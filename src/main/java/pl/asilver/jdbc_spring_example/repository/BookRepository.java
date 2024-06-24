package pl.asilver.jdbc_spring_example.repository;

import pl.asilver.jdbc_spring_example.model.Book;

import java.util.List;

public interface BookRepository {
        List<Book> findAllBooks();
        Book findBookById(Long id);
}
