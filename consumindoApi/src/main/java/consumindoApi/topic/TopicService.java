package consumindoApi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class  TopicService{
	
	private List<Topicos> listar =  new ArrayList<Topicos>(Arrays.asList(
			new Topicos("001","Rafael - 1", "Teste 1 de consumo de API com SpringBoot"),
			new Topicos("002","Rafael - 2", "Teste 2 de consumo de API com SpringBoot"),
			new Topicos("003","Rafael - 3", "Teste 3 de consumo de API com SpringBoot"),
			new Topicos("004","Rafael - 4", "Teste 4 de consumo de API com SpringBoot"),
			new Topicos("005","Rafael - 5", "Teste 5 de consumo de API com SpringBoot")			
			
	));
	/*
		
	private List<Topicos> listar() {

		Topicos t1 = new Topicos();
		Topicos t2 = new Topicos();
		Topicos t3 = new Topicos();

		t1.setNome();
		t1.setId("");
		t1.setDescricao();

		t2.setNome("Rafael - 2");
		t2.setId("002");
		t2.setDescricao("Teste de consumo de API com SpringBoot");

		t3.setNome("Rafael - 3");
		t3.setId("003");
		t3.setDescricao("Teste de consumo de API com SpringBoot");

		ArrayList<Topicos> itens = new ArrayList<Topicos>();
		itens.add(t1);
		itens.add(t2);
		itens.add(t3);

		return itens;
	}
	*/
	public List<Topicos> allTopicos(){
		return listar;
	}
	
	public Topicos getAllTopicos(String id){
		
		return listar.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopicos(Topicos t) {
		listar.add(t);
		
	}
	
	


	
	
}
