package com.crud.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.empties.User;

public interface UserRepositorio extends JpaRepository<User, Long>{

}
