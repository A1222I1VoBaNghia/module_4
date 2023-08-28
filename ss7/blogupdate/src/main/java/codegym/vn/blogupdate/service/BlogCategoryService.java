package codegym.vn.blogupdate.service;

import codegym.vn.blogupdate.entity.BlogCategory;

import java.util.List;

public interface BlogCategoryService {
    BlogCategory findById(int id);
    List<BlogCategory> findAll();
    void create(BlogCategory blogCategory);
    void update(BlogCategory blogCategory);
    void delete(BlogCategory blogCategory);
}
