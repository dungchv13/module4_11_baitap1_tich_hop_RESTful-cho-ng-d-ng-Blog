package model.repository;

import model.entities.Comment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {
}
