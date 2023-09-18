package codegym.vn.blog_restful.service;

import codegym.vn.blog_restful.entity.Blog;
import codegym.vn.blog_restful.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository repository;
    @Override
    public void createBlog(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void updateBlog(Blog blog) {
        repository.save(blog);
    }

    @Override
    public void deleteBlog(String id) {
        repository.deleteById(id);
    }

    @Override
    public Blog findBlogById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAllBlog() {
        return repository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public List<Blog> findBlogByContentOrBlogCategoryOrAuthor(String content, String blogCategoryName, String author) {
        return repository.findBlogByContentOrBlogCategoryOrAuthor(content,blogCategoryName,author);
    }

    @Override
    public List<Blog> findBlogByCategoryId(int id) {
        return repository.findBlogsByBlogCategoryCategoryId(id);
    }
}
