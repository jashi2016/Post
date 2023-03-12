package com.kiran.Post.Controller;

import com.kiran.Post.Model.Post;
import com.kiran.Post.PostApplication;
import com.kiran.Post.Service.PostInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    PostInt postInt;

    @PostMapping("/add")
    public Post addPost(@RequestBody Post post){
        return postInt.addPost(post);
    }

    @GetMapping("/get")
    public List<Post> getAllPosts(){
        return postInt.getAllPosts();
    }
}
