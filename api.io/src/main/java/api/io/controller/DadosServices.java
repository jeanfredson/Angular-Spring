package api.io.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DadosServices {

	private List<Dados> lista() {
		Dados d = new Dados();

		d.setId(1);
		d.setNome("Rafael Carvalho");
		d.setIdade("31");

		ArrayList<Dados> listando = new ArrayList<Dados>();
		listando.add(d);
		
		return listando;
	}
	
	public List<Dados> getListar(){
		return lista();
	}
	public List<Dados> getDados(int id){
		
		ArrayList<Dados> itens = new ArrayList<Dados>();
		
		for(Dados d : lista()){
			
			d.setId(id);
			itens.add(d);
		}
		
		return itens;
	}
	
	

}
