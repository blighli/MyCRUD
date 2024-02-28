package com.liqilei.mycrud.repository;

import com.liqilei.mycrud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
