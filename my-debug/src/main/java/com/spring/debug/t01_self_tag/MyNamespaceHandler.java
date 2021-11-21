package com.spring.debug.t01_self_tag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author zhangfengbo
 * @date: 2021/11/20 20:46
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
	@Override
	public void init() {
		registerBeanDefinitionParser("user", new MyUserBeanDefinitionParser());
	}
}
