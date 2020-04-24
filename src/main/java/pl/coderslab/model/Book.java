//package pl.coderslab.model;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.context.annotation.ScopedProxyMode;
//import org.springframework.stereotype.Component;
//import org.springframework.web.context.WebApplicationContext;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "books")
//@Scope(value = WebApplicationContext.SCOPE_SESSION,
//        proxyMode = ScopedProxyMode.TARGET_CLASS)
//public class Book {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    long id;
//    String isbn;
//    String title;
//    String author;
//    String publisher;
//    String type;
//
//    public Book(long id, String isbn, String title, String author, String publisher, String type) {
//        this.id = id;
//        this.isbn = isbn;
//        this.title = title;
//        this.author = author;
//        this.publisher = publisher;
//        this.type = type;
//    }
//
//    public Book() {
//    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }
//
//    public String getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(String isbn) {
//        this.isbn = isbn;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public String getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(String publisher) {
//        this.publisher = publisher;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    @Override
//    public String toString() {
//        return "Book{" +
//                "id=" + id +
//                ", isbn='" + isbn + '\'' +
//                ", title='" + title + '\'' +
//                ", author='" + author + '\'' +
//                ", publisher='" + publisher + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }
//}
