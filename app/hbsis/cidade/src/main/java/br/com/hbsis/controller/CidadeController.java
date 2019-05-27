package br.com.hbsis.controller;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import javax.validation.Valid;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.hbsis.model.Cidade;
import br.com.hbsis.model.Temperatura;
import br.com.hbsis.repository.CidadeRepository;

@RestController
@RequestMapping("/api")
public class CidadeController {
	
	private static final String GET_URL = "http://api.openweathermap.org/data/2.5/forecast/daily?";

	@Autowired
	CidadeRepository cidadeRepository;

	@RequestMapping("/cidades")
	public List<Cidade> getAllCidade() {
		return cidadeRepository.findAll();
	}
	
	
	@GetMapping(path = {"/cidades/{id}/temperatura"})
	public List<Temperatura> getTemperaturaPorCidade(@PathVariable long id) throws URISyntaxException, UnsupportedEncodingException
	{
		JSONArray listTemp = new JSONArray();
		List<Temperatura> temperatura = new ArrayList<>();
		
			try {
				String id1 = String.format("id=%s", Long.toString(id));
				String cnt = String.format("&cnt=%s", Long.toString(5));
				String units = String.format("&units=%s", URLEncoder.encode("metric", "UTF-8"));
				String appId = String.format("&appId=%s", URLEncoder.encode("eb8b1a9405e659b2ffc78f0a520b1a46", "UTF-8"));
				
				
				URI url = new URI(GET_URL + id1 + cnt + units + appId);
				RestTemplate restTemplate = new RestTemplate();
				 
				HttpHeaders headers = new HttpHeaders();
				headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
				HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
				 
				ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
								
				JSONObject json = new JSONObject(result.getBody().toString());
				JSONObject jsonMain = new JSONObject();
				
				listTemp = new JSONArray(json.get("list").toString());
								
				Temperatura temp =  new Temperatura();
								
				for (int j = 0; j < listTemp.length(); j++) {
					temp =  new Temperatura();
					json = listTemp.getJSONObject(j);
					LocalDateTime triggerTime =
					        LocalDateTime.ofInstant(Instant.ofEpochSecond(json.getLong("dt")), 
					                                TimeZone.getDefault().toZoneId());
					
					LocalDate dt = triggerTime.toLocalDate();
					temp.setData(dt);
					
					jsonMain = new JSONObject(json.get("temp").toString());
					
					
					temp.setTemp(jsonMain.get("eve").toString());
					temp.setTempMin(jsonMain.get("min").toString());
					temp.setTempMax(jsonMain.get("max").toString());
					
					temperatura.add(temp);
				}

			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			return temperatura;
	}
		
	@PostMapping("/cidades")
	public Cidade save(@Valid @RequestBody Cidade cidade) {
	    return cidadeRepository.save(cidade);
	}


}
