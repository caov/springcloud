package com.van.provider.dao;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.van.provider.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}
