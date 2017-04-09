package com.example.dao;

import com.example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wuxiaodong on 2017/4/9.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsernameAndPassword(String username, String password);
}
