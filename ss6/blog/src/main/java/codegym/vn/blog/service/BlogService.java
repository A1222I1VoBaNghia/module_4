package codegym.vn.blog.service;

import codegym.vn.blog.entity.Blog;

import java.util.List;

public interface BlogService {
    void create(Blog blog);
    void update(Blog blog);
    Blog findById(int id);
    List<Blog> findAll();
    void deleteById(int id);
}
