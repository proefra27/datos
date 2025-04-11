package com.upiiz.datos.services;

import com.upiiz.datos.models.CommentModel;
import com.upiiz.datos.models.ProductModel;
import com.upiiz.datos.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements CommentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<CommentModel> findAll() {
        return List.of();
    }

    @Override
    public CommentModel findById(int id) {
        return null;
    }

    @Override
    public List<CommentModel> findCommentsProductById(int idProduct) {

        return jdbcTemplate.query("SELECT * FROM comments WHERE id_product = ?",
                        new BeanPropertyRowMapper<>(CommentModel.class),idProduct);
    }

    @Override
    public void save(CommentModel comment) {

    }

    @Override
    public void update(CommentModel comment) {

    }

    @Override
    public void deleteById(int id) {

    }
}
