package org.practice;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class DemoBeanPostProcessor1 implements BeanPostProcessor, Ordered{

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out
				.println("Bean post processor 1 {after bean is initialized .. } " + arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		System.out.println(
				"Bean post processor 1 {before bean is initialized .. } " + arg1);
		return arg0;
	}

	@Override
	public int getOrder() {
		return 0;
	}
	
}
