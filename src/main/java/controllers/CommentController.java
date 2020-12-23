package controllers;



import model.entities.Comment;
import model.entities.Response;
import model.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class CommentController {
    @Autowired
    private CommentService commentService;
    Response response = new Response();

    @GetMapping
    public Response get(){
        List<Comment> comments = commentService.findAll();
        response.data = comments;
        response.status = response.SUCCESS;
        response.message = "Success";
        return response;
    }

    @GetMapping("/{id}")
    public Response search(@PathVariable("id")Long id){
        Comment comment = commentService.findById(id);
        if (comment == null){
            response.data = comment;
            response.status = response.ERROR;
            response.message = "CANT FIND ITEM HAVE THAT ID";
        }
        else{
            response.data = comment;
            response.status = response.SUCCESS;
            response.message = "Success";
        }
        return response;
    }

    @PostMapping
    public Response save(@RequestBody Comment comment){
        boolean isSave = commentService.save(comment);
        response.data = comment;
        if(isSave){
            response.status = response.SUCCESS;
            response.message = "Success Save";
        }
        else{
            response.status = response.ERROR;
            response.message = "False Save";
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable("id")Long id){
        Comment comment = commentService.findById(id);
        boolean isDelete = commentService.remove(id);
        response.data = comment;
        if (!isDelete){
            response.status = response.ERROR;
            response.message = "CANT FIND ITEM HAVE THAT ID";
        }else{
            response.status = response.SUCCESS;
            response.message = "Success Delete";
        }
        return response;

    }

}
