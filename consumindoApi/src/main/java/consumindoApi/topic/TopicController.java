package consumindoApi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService ts;
	
	
	@RequestMapping("/topicos/all")
	public List<Topicos> getAll(){
		
		return ts.allTopicos();
		
	}
	
	@RequestMapping("/topicos/{id}")
	public Topicos getTopicos(@PathVariable String id){
		return ts.getAllTopicos(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topicos")
	public void addTopicos(@RequestBody Topicos t){
		ts.addTopicos(t);
	}

}
