package com.endlesshorses.oot.swagger;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	public GroupedOpenApi getItemApi() {

		return GroupedOpenApi
				.builder()
				.group("item")
				.pathsToMatch("/api/item/**")
				.build();
	}

	@Bean
	public GroupedOpenApi getMemberApi() {

		return GroupedOpenApi
				.builder()
				.group("member")
				.pathsToMatch("/api/member/**")
				.build();

	}

	@Bean
	public OpenAPI getOpenApi() {

		return new OpenAPI().components(new Components())
				.info(getInfo());

	}

	private Info getInfo() {
		return new Info()
				.version("1.0.0")
				.description("COMMERCE REST API DOC")
				.title("COMMERCE");
	}
}