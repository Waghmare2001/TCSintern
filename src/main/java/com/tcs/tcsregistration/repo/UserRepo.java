package com.tcs.tcsregistration.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.tcsregistration.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
