package br.com.ivogoncalves.ms_gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRoutesConfig {

	
	@Bean
	RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("ms-customer", r -> r.path("/api/customers/**").uri("lb://ms-customer"))
				.route("ms-cards", r -> r.path("/api/cards/**").uri("lb://ms-cards"))
				.build();
		
	}
}
