package pl.coderslab.model;

import java.util.List;

public interface BookService {

    List<Book> getList();

    Book getBookById(long id);

    void update(long id, Book book);

    void add(Book book);

    void delete(long id);
}
