package com.kiran.Post.Service;

import com.kiran.Post.Model.Post;

import java.util.List;

public interface PostInt {
    Post addPost(Post post);

    List<Post> getAllPosts();
}
