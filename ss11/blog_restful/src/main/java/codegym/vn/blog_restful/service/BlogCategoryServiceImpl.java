package codegym.vn.blog_restful.service;

import codegym.vn.blog_restful.entity.BlogCategory;
import codegym.vn.blog_restful.repository.BlogCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogCategoryServiceImpl implements BlogCategoryService{
    @Autowired
    BlogCategoryRepository repository;
    @Override
    public BlogCategory findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<BlogCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public void create(BlogCategory blogCategory) {
        repository.save(blogCategory);
    }

    @Override
    public void update(BlogCategory blogCategory) {
        repository.save(blogCategory);
    }

    @Override
    public void delete(BlogCategory blogCategory) {
        repository.delete(blogCategory);
    }
}
