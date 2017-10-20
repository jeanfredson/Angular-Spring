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
	
	public List<Topicos> allTopicos(){
		return listar;
	}
	
	public Topicos getAllTopicos(String id){
		
		return listar.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopicos(Topicos t) {
		listar.add(t);
		
	}

	public void updateTopicos(String id, Topicos t) {
		for(int i=0; i < listar.size(); i++){
			Topicos tp = listar.get(i);
			if(t.getId().equals(id)){
				listar.set(i, t);
				return;
			}
		}
		
	}

	public void deleteTopicos(String id) {
		listar.removeIf(t -> t.getId().equals(id));
	}
	
	
}