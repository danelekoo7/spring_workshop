package pl.coderslab.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.coderslab.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
public class BookDao {

    @PersistenceContext
    EntityManager entityManager;

    public void saveBook(Book book) {
        entityManager.persist(book);
    }

    public List<Book> findAll(){
        Query query = entityManager.createQuery("SELECT b FROM Book b");
        List<Book> books = query.getResultList();
        return books;
    }

    public void update(Book book,long id) {
        Book newBook = findById(id);
        newBook.setAuthor(book.getAuthor());
        newBook.setIsbn(book.getIsbn());
        newBook.setPublisher(book.getPublisher());
        newBook.setTitle(book.getTitle());
        newBook.setType(book.getType());
        entityManager.merge(newBook);
    }

    public Book findById(long id) {
        return entityManager.find(Book.class, id);
    }

    public void delete(Book book) {
        entityManager.remove(entityManager.contains(book) ?
                book : entityManager.merge(book));
    }
}