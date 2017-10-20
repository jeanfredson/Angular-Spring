package api.io.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@RequestMapping("/buscar")
	public String getAll(){
		
		return "Buscando API";
	}
	
	@RequestMapping("/listar")
	public List<Dados> itens(){
		
		Dados d = new Dados();
		
		d.setId(1);
		d.setNome("Rafael Carvalho");
		d.setIdade("31");
		
		ArrayList<Dados> listando = new ArrayList<Dados>();
		listando.add(d);
		
		return listando;
	}

}
