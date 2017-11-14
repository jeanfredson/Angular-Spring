package io.treinamento.controller;

import io.treinamento.service.TopicosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method=RequestMethod.POST, value="/buscando")
	public void addTopicos(@RequestBody Topicos t){
		tpservice.addTopicos(t);
	}
	@RequestMapping(method=RequestMethod.PUT, value="/buscando/{id}")
	public void updateTopicos(@RequestBody Topicos t, @PathVariable String id){
		tpservice.updateTopicos(id, t);
	}
	

}
