package com.jpa.repository;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.ElasticsearchTransport;

public class OrderElasticSearchRepository  extends ElasticsearchClient{

	public OrderElasticSearchRepository(ElasticsearchTransport transport) {
		super(transport);
	}

}
