package com.io.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.io.api.model.Api;

@Service
public class ApiService {
	
		
	private List<Api> listando = new ArrayList<Api>(Arrays.asList(
			new Api(1, "Rafael 1", "123456789 - 1", "Sistemas1"),
			new Api(2, "Rafael 2", "123456789 - 2", "Sistemas2"),
			new Api(3, "Rafael 3", "123456789 - 3", "Sistemas3"),
			new Api(4, "Rafael 4", "123456789 - 4", "Sistemas4")			
			));
	
	public List<Api> res(){
		return listando;
	}
	
	public List<Api> listaID(int i){
		
		ArrayList<Api> itens = new ArrayList<Api>();
		Api api = new Api();
		api.setId(i);
		for(Api a : listando){
			
			a.getId();
			a.getNome();
			a.getCurso();			
			itens.add(a);
		}
		return itens;
	}
	
	
	
	
	
	
	
	
	
	
	
}

	
