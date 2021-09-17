package vn.techmaster.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vn.techmaster.bookstore.model.Book;
import vn.techmaster.bookstore.service.BookService;
@RestController
@RequestMapping("/book/")
public class RestBook {
    @Autowired
    private BookService bookService;
    
    @GetMapping("id")
    public ResponseEntity<Book> getBook(@RequestParam(value="id") int id){
        Book book = bookService.getBook(id);
        return ResponseEntity.ok().body(book);
    }
    @PostMapping("add")
    public ResponseEntity<List<Book>> addBook(@RequestParam(value = "id")int id,
                                        @RequestParam(value = "title") String title,
                                        @RequestParam(value = "description") String description ){
        Book book = new Book(id, title, description);
        bookService.add(book);

        List<Book> bookList = bookService.getAll();
        return ResponseEntity.ok().body(bookList);
    }


    @PutMapping("update")
    public ResponseEntity<List<Book>> update(@RequestParam(value = "id") int id,
                                             @RequestParam(value = "title", required = false) String title,
                                             @RequestParam(value = "description", required = false) String description) {
        bookService.update(id, title, description);

        List<Book> bookList = bookService.getAll();
        return ResponseEntity.ok().body(bookList);
    }

    @DeleteMapping("delete")
    public ResponseEntity<List<Book>> delete(@RequestParam(value = "id") int id) {
        bookService.delete(id);

        List<Book> bookList = bookService.getAll();
        return ResponseEntity.ok().body(bookList);
    }



}
