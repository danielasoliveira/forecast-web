package br.com.hbsis.cidade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;

public class CidadeTeste {
	
	@LocalServerPort
	private int port;

	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();

	@Test
	public void getCidadesTeste() {

		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				criarUrlChamada("/api/cidades"),
				HttpMethod.GET, entity, String.class);

		assertNotNull(response);
	}

	@Test
	public void getTemperaturaPorCidade() {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);

		ResponseEntity<String> response = restTemplate.exchange(
				criarUrlChamada("/api/cidades/3452465/temperatura"),
				HttpMethod.GET, entity, String.class);

		assertNotNull(response);
	}
	
	private String criarUrlChamada(String uri) {
		return "http://localhost:" + 8080 + uri;
	}
	
	
}
