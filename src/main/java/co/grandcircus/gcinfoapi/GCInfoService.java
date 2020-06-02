package co.grandcircus.gcinfoapi;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GCInfoService {
	
	private RestTemplate rest = new RestTemplate();
	
		public OuterMost displayInfo(){
			String url = "https://grandcircusco.github.io/demo-apis/grand-circus.json";
			
			OuterMost response = rest.getForObject(url, OuterMost.class);
			
			
			return response;
		}

}
