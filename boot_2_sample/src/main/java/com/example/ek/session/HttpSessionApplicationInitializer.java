package com.example.ek.session;

import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

public class HttpSessionApplicationInitializer extends AbstractHttpSessionApplicationInitializer {

	public HttpSessionApplicationInitializer() {
		super(SpringSessionConfig.class); 
	}
}
