package model.service;

import model.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAll();

    Comment findById(Long id);

    boolean save(Comment comment);

    boolean remove(Long id);
}
