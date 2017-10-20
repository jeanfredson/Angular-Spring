package consumindoApi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {
	
	@RequestMapping("/ola")
	public String ola(){
		String info = "Teste com SpringBoot para consumir API e Integrar Angular 4";
		return info;
	}
}
