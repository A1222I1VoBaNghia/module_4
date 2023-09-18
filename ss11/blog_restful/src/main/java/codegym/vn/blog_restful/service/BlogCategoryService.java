package codegym.vn.blog_restful.service;

import codegym.vn.blog_restful.entity.BlogCategory;

import java.util.List;

public interface BlogCategoryService {
    BlogCategory findById(int id);
    List<BlogCategory> findAll();
    void create(BlogCategory blogCategory);
    void update(BlogCategory blogCategory);
    void delete(BlogCategory blogCategory);
}
