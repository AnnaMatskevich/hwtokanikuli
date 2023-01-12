package com.simple.test_app;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface UserRepository extends JpaRepository<User,
        Long> {
    //List<Tutorial> findByPublished(boolean published);
    //List<Tutorial> findByTitleContaining(String title);
}
