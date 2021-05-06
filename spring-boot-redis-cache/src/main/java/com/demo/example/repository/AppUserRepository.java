package com.demo.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.example.beans.APPUser;

public interface AppUserRepository extends JpaRepository<APPUser, Integer> {

}
