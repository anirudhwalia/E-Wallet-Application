package com.example.EwalletApp.Repository;

import com.example.EwalletApp.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}

