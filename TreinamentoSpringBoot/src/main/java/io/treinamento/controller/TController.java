package io.treinamento.controller;

import io.treinamento.service.TopicosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TController {
	
	@Autowired
	private TopicosService tpservice;
	
	@RequestMapping("/buscando")
	public List<Topicos> getAllTopicos(){
		return tpservice.getListar();
		
	}
	@RequestMapping("/buscando/{id}")
	public Topicos getTopicosID(@PathVariable String id){
		return tpservice.getTopicosID(id);
	}

}
