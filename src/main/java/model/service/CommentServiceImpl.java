package model.service;

import model.entities.Comment;
import model.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentServiceImpl implements CommentService{
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return (List<Comment>) commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return commentRepository.findOne(id);
    }

    @Override
    public boolean save(Comment comment) {
        try {
            commentRepository.save(comment);
        }catch (Exception e){
            return false;
        }
        return true;
    }

    @Override
    public boolean remove(Long id) {
        try {
            commentRepository.delete(id);
        }catch (Exception e){
            return false;
        }
        return true;
    }
}
