package com.rrkj.flour.utils.web.config;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcRegistrations;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	@Value("${application.name}")
	private String appName = "nsns-service";

	@Value("${application.version}")
	private String appVersion = "1.0";

	@Bean
	public WebMvcRegistrations webMvcRegistrationsHandlerMapping() {
		return new WebMvcRegistrations() {

			@Override
			public RequestMappingHandlerMapping getRequestMappingHandlerMapping() {
				return new RequestMappingHandlerMapping() {

					@Override
					protected void registerHandlerMethod(Object handler, Method method, RequestMappingInfo mapping) {
						Class<?> beanType = method.getDeclaringClass();
						if (AnnotationUtils.findAnnotation(beanType, RestController.class) != null) {
							PatternsRequestCondition apiPattern = new PatternsRequestCondition(
									"services/" + WebConfig.this.appName + "/" + WebConfig.this.appVersion)
											.combine(mapping.getPatternsCondition());

							mapping = new RequestMappingInfo(mapping.getName(), apiPattern,
									mapping.getMethodsCondition(), mapping.getParamsCondition(),
									mapping.getHeadersCondition(), mapping.getConsumesCondition(),
									mapping.getProducesCondition(), mapping.getCustomCondition());
						}

						super.registerHandlerMethod(handler, method, mapping);
					}
				};
			}
		};
	}

	@Bean
	public AccessTokenVerifyInterceptor tokenVerifyInterceptor() {
		return new AccessTokenVerifyInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(tokenVerifyInterceptor());
	}
}