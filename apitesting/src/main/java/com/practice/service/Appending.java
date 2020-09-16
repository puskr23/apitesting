package com.practice.service;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Component
public class Appending {
	final String url="https://new.api.pareva.umelimited.com/rest/validateMsisdn";
	public String getOperator(String msisdn)
	{
		RestTemplate rest =new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
		        .queryParam("msisdn", msisdn)
		        .queryParam("region", "CH");
		        

		HttpEntity<?> entity = new HttpEntity<>(headers);

		ResponseEntity<Info> response = rest.exchange(
		        builder.toUriString(), 
		        HttpMethod.GET, 
		        entity, 
		        Info.class);
		
		Info a=response.getBody();
		return a.getOperator();
		}
		
		
		
		
	

}
