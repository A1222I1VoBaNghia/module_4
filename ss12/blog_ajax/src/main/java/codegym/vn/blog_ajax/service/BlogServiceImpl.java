package codegym.vn.blog_ajax.service;

import codegym.vn.blog_ajax.entity.Blog;
import codegym.vn.blog_ajax.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public void createBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void updateBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void deleteBlog(Blog blog) {
        blogRepository.delete(blog);
    }

    @Override
    public Blog findBlogById(String id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public List<Blog> findAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }



    @Override
    public List<Blog> findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(String keyword) {
        return blogRepository.findBlogsByAuthorContainingIgnoreCaseOrContentContainingIgnoreCaseOrBlogCategory_CategoryName(keyword, keyword, keyword);
    }


}
