package com.jpa;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;

@Configuration
public class ElsticSearchApplication {

	@Bean
	public RestClient restClient() {
		RestClient restClients = RestClient.builder(
				new HttpHost("localhost",9200)).build();
		return restClients;   
	}
	
	@Bean
	public ElasticsearchTransport getElasticsearchTransport() {
		
		return new RestClientTransport(restClient(), new JacksonJsonpMapper());
	}
	
	@Bean
	public ElasticsearchClient getElasticsearchClient() {
		ElasticsearchClient elaClient = new ElasticsearchClient(getElasticsearchTransport());
		return elaClient;
		
		//return new ElasticsearchClient(getElasticsearchTransport());
	}

}
