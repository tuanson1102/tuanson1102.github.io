package vn.techmaster.bookstore.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.repository.BookDao;

public class BookService {
    @Autowired
    BookDao bookDao;
    
    public BookService(){
        this.bookDao = bookDao;
    }

    public List<Book> getAll(){
        return this.bookDao.getAll();
    }

    public Book getBook(int id) {
        Optional<Book> optional = bookDao.get(id);
        final Book[] myBook = {null};
        optional.ifPresent(book -> myBook[0] = book);
        return myBook[0];
    }

    public void add(Book book) {
       bookDao.add(book);
    }

    public void update(int id, String title, String description) {
        Book book = getBook(id);
        if (book != null) {
            if (!Objects.equals(title, "")) {
                book.setTitle(title);
            }
            if (!Objects.equals(description, "")) {
                book.setDescription(description);
            }
        } else {
            add(new Book(id, title, description));
        }
    }


    public void delete(int id) {
        Book book = getBook(id);
        if (book != null) {
            bookDao.delete(book);
        }
    }
}
