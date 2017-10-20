package api.io.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	@Autowired
	private DadosServices ds;
	
	@RequestMapping("/listar")
	public List<Dados> itens(){
		return ds.getListar();
	}
	
	@RequestMapping("/buscar/{id}")
	public List<Dados> dadosID(@PathVariable int id){
		
		if(ds.getDados(id).isEmpty()){
			String erro = "Erro na buscar";
		}
		return ds.getDados(id);
				
	}
	

}
