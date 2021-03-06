package pl.coderslab.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoryBookService implements BookService {
    private List<Book> list;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz glowa, Java.",
                "Sierra Kathy, Bates Bert", "Helion", "programming"));
        list.add(new Book(3L, "9780130819338", "Java 2. Podstawy",
                "Cay Horstmann, Gary Cornell", "Helion", "programming"));
       }

    @Override
    public List<Book> getList() {
        return list;
    }

    @Override
    public Book getBookById(long id) {
        for (Book b : list) {
            if (b.id == id) {
                return b;
            }
        }
        return null;
    }

    @Override
    public void update(long id, Book book) {

        for (Book b : list) {
            if (b.id == id) {
                b.author = book.author;
                b.id = book.id;
                b.publisher = book.publisher;
                b.isbn = book.isbn;
                b.title = book.title;
                b.type = book.type;
            }
        }
    }

    @Override
    public void add(Book book) {
        list.add(book);
    }

    @Override
    public void delete(long id) {
        list.remove(getBookById(id));
    }
}
