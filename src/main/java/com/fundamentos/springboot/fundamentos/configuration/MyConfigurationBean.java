package com.fundamentos.springboot.fundamentos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fundamentos.springboot.fundamentos.bean.MyBean;
import com.fundamentos.springboot.fundamentos.bean.MyBean2Implement;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependency;
import com.fundamentos.springboot.fundamentos.bean.MyBeanWithDependencyImplement;
import com.fundamentos.springboot.fundamentos.bean.MyOperation;
import com.fundamentos.springboot.fundamentos.bean.MyOperationImplement;

@Configuration
public class MyConfigurationBean {
	@Bean
	public MyBean beanOperation() {
		return new MyBean2Implement();
	}
	
	@Bean
	public MyOperation beanOperationOperation() {
		return new MyOperationImplement();
	}

	@Bean
	public MyBeanWithDependency beanOperationOperationWithDependency(MyOperation myOperation) {
		return new MyBeanWithDependencyImplement(myOperation);
	}

}
