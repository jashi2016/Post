package com.kiran.Post.Service;

import com.kiran.Post.Model.Post;
import com.kiran.Post.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostIntImpl implements PostInt{
    @Autowired
    PostRepository postRepository;
    @Override
    public Post addPost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }
}
