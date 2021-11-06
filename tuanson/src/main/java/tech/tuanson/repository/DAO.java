package tech.tuanson.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import tech.tuanson.service.SearchRequest;

@Repository
public interface DAO<T> {
    List<T> getAll();

    Optional<T> getByID(int id);

    void add(T newObject);

    void update(T updatedObject);

    void delete(T deletedObject);

    List<T> sort(SearchRequest searchRequest);
}
