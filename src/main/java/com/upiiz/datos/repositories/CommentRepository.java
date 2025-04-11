package com.upiiz.datos.repositories;

import com.upiiz.datos.models.CommentModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository {
    List<CommentModel> findAll();
    CommentModel findById(int id);
    List<CommentModel> findCommentsProductById(int idProduct);
    void save(CommentModel comment);
    void update(CommentModel comment);
    void deleteById(int id);
}
