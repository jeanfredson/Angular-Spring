package com.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.empties.User;
import com.crud.repositorio.UserRepositorio;

@SpringBootApplication
public class CrudApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepositorio userRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		userRepositorio.save(new User("Rafael 1", "Carvalho 1"));
		userRepositorio.save(new User("Rafael 2", "Carvalho 2"));
		userRepositorio.save(new User("Rafael 3", "Carvalho 3"));
		
	}
}
