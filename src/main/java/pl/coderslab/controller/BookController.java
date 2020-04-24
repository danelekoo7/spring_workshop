//package pl.coderslab.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import pl.coderslab.model.Book;
//import pl.coderslab.model.BookService;
//import pl.coderslab.model.MemoryBookService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/books")
//public class BookController {
//
//    @Autowired
//    private final BookService bookService;
//
//    public BookController(MemoryBookService bookService) {
//        this.bookService = bookService;
//    }
//
//    @GetMapping("/hello")
//    public String hello() {
//        return "{hello: World}";
//    }
//
//    @RequestMapping("/helloBook")
//    public Book helloBook() {
//        return new Book(1L, "9788324631766", "Thinking in Java",
//                "Bruce Eckel", "Helion", "programming");
//    }
//
//    @GetMapping
//    public List<Book> getBooks() {
//        return bookService.getList();
//    }
//
//    @GetMapping("{id}")
//    public Book getBooks(@PathVariable long id) {
//        return bookService.getBookById(id);
//    }
//
//    @PostMapping
//    public void add(@RequestBody Book book) {
//        bookService.add(book);
//    }
//
//    @PutMapping("{id}")
//    public void put(@RequestBody Book book, @PathVariable long id) {
//        bookService.update(id, book);
//    }
//
//
//    @DeleteMapping("{id}")
//    public void delete(@PathVariable long id) {
//        bookService.delete(id);
//    }
//
//}
