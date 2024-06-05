package com.robinlb.appspringboot.repository;

import com.robinlb.appspringboot.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author joel
 */
public interface PostRepository extends CrudRepository<Post, Long> {
    
}
