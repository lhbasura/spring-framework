package com.lhbasura.spring.learn.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author lhb
 * @version MyBeanFactoryProcessor, v 1.0 2020/2/26 9:54 下午
 * @desc
 */

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		GenericBeanDefinition beanDefinition = (GenericBeanDefinition) beanFactory.getBeanDefinition("c");
		System.out.println("processor:"+beanDefinition.getBeanClassName());
		beanDefinition.setBeanClass(Fruit.class);
	}
}
