package io.treinamento.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
	
	@RequestMapping("/buscando")
	public List<Topicos> getAllTopicos(){
		return Arrays.asList(
				new Topicos("1", "Rafael-1", "Teste 001"),
				new Topicos("2", "Rafael-2", "Teste 002"),
				new Topicos("3", "Rafael-3", "Teste 003"),
				new Topicos("4", "Rafael-4", "Teste 004"),
				new Topicos("5", "Rafael-5", "Teste 005"),
				new Topicos("6", "Rafael-6", "Teste 006"),
				new Topicos("7", "Rafael-7", "Teste 007")
		);
		
	}

}
