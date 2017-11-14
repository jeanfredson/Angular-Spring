package io.treinamento.service;

import io.jpa.repository.TopicosRepository;
import io.treinamento.controller.Topicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicosService {
	
	@Autowired
	private TopicosRepository tr;
	
	
	private List<Topicos> top = new ArrayList<Topicos>(Arrays.asList(
				new Topicos("1", "Rafael-1", "Teste 001"),
				new Topicos("2", "Rafael-2", "Teste 002"),
				new Topicos("3", "Rafael-3", "Teste 003"),
				new Topicos("4", "Rafael-4", "Teste 004"),
				new Topicos("5", "Rafael-5", "Teste 005"),
				new Topicos("6", "Rafael-6", "Teste 006"),
				new Topicos("7", "Rafael-7", "Teste 007")
		));
	
	public List<Topicos> getListar(){
		List<Topicos> topicos = new ArrayList<Topicos>();
		tr.findAll()
		.forEach(top::add);
		return topicos;
	}
	public Topicos getTopicosID(String id){
		//return top.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return tr.findOne(id);
	}
	
	public void addTopicos(Topicos t){
		tr.save(t);
	}
	public void updateTopicos(String id, Topicos t) {
		
		tr.save(t);
		/*
		for(int i=0; i< top.size(); i++){
		
			Topicos topicos = top.get(i);
			if(topicos.getId().equals(id)){
				top.set(i, t);
				return;
			}
		}
		*/
		
	}
	public void deleteTopicosID(String id) {
		//top.removeIf(t -> t.getId().equals(id));
		tr.delete(id);
	}



}
