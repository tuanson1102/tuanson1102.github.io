package vn.techmaster.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import vn.techmaster.bookstore.repository.BookDao;
import vn.techmaster.bookstore.service.BookService;

@Configuration
public class RepoConfig {

  @Bean
  public BookDao bookDao() {
    return new BookDao();
  }  
  @Bean
  public BookService BookService(){
    return new BookService();
  }
}
