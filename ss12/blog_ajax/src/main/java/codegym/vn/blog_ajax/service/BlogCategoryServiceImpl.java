package codegym.vn.blog_ajax.service;

import codegym.vn.blog_ajax.entity.BlogCategory;
import codegym.vn.blog_ajax.repository.BlogCategoryRepository;
import codegym.vn.blog_ajax.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogCategoryServiceImpl implements BlogCategoryService{
    @Autowired
    private BlogCategoryRepository blogCategoryRepository;

    @Override
    public BlogCategory findById(int id) {
        return blogCategoryRepository.findById(id).orElse(null);
    }

    @Override
    public List<BlogCategory> findAll() {
        return blogCategoryRepository.findAll();
    }

    @Override
    public void create(BlogCategory blogCategory) {
        blogCategoryRepository.save(blogCategory);
    }

    @Override
    public void update(BlogCategory blogCategory) {
        blogCategoryRepository.save(blogCategory);
    }

    @Override
    public void delete(BlogCategory blogCategory) {
        blogCategoryRepository.delete(blogCategory);

    }
}
