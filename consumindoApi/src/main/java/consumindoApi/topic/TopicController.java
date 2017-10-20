package consumindoApi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("topico")
public class TopicController {
	
	@Autowired
	private TopicService ts;
	
	
	@RequestMapping("/all")
	public List<Topicos> getAll(){
		
		return ts.allTopicos();
		
	}
	
	@RequestMapping("/topicos/{id}")
	public Topicos getTopicos(@PathVariable String id){
		return ts.getAllTopicos(id);
	}

}
