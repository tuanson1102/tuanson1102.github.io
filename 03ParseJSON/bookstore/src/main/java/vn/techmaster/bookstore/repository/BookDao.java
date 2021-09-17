package vn.techmaster.bookstore.repository;

import java.util.List;
import java.util.Optional;
import vn.techmaster.bookstore.model.Book;

public class BookDao extends Dao<Book> {

  public BookDao() {
    collections.add(new Book(1, "Không gia đình", "Chú bé Remy lang thang theo gánh xiếc của bác Vitaly"));
    collections.add(new Book(2, "Cuốn theo chiều gió", "Nội chiến Hoa kỳ, cuộc tình giữa Red Butler và Ohara"));
    collections.add(new Book(3, "Cô bé bọ lem", "cô bé mồ côi"));
  }

  @Override
  public List<Book> getAll() {
    return collections;
  }

  @Override
  public Optional<Book> get(int id) {
    Book bookById = (Book) collections.stream()
      .filter(book -> id == book.getId())
      .findAny()
      .orElse(null);
    return Optional.ofNullable(bookById);
  }

  @Override
  public void add(Book book) {
    collections.add(book);
  }

  @Override
  public void update(Book book) {
    // TODO Auto-generated method stub
  }

  @Override
  public void deleteByID(int id) {
    // TODO Auto-generated method stub
  }

  @Override
  public void delete(Book book) {
    collections.remove(book);
  }

  
}