//package pl.coderslab.model;
//
//import pl.coderslab.dao.BookDao;
//
//import java.awt.print.Book;
//import java.util.List;
//
//public class DbBookService implements BookService {
//    private final BookDao bookDao;
//
//    public DbBookService(BookDao bookDao) {
//        this.bookDao = bookDao;
//    }
//
//    @Override
//    public List<Book> getList() {
////
////        bookDao.
//        return null;
//    }
//
//    @Override
//    public Book getBookById(long id) {
//        return bookDao.findById(id);
//    }
//
//    @Override
//    public void update(long id, Book book) {
//
//        bookDao.update(book, id);
//    }
//
//    @Override
//    public void add(Book book) {
//        bookDao.saveBook(book);
//    }
//
//
//    @Override
//    public void delete(long id) {
//        Book book = bookDao.findById(id);
//        bookDao.delete(book);
//    }
//}
