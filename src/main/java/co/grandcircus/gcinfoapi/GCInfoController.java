package co.grandcircus.gcinfoapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GCInfoController {
	
	@Autowired
	private GCInfoService service;
	
	@RequestMapping("/")
	public String home(Model model) {
		
		OuterMost outermost = service.displayInfo();
		
		String SchoolName = outermost.getOrganization();
		model.addAttribute("SchoolName",SchoolName);
		
		List<Room> rooms = outermost.getRooms();
		model.addAttribute("rooms",rooms);
		
		List<Language> languages = outermost.getLanguages();
		model.addAttribute("languages" ,languages);
		
		Ceo ceo = outermost.getCeo();
		model.addAttribute("ceo",ceo);
		
		
		return "index";
	}
}
