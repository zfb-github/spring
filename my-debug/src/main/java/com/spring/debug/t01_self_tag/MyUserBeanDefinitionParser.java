package com.spring.debug.t01_self_tag;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * @author zhangfengbo
 * @date: 2021/11/20 20:34
 */
public class MyUserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
	@Override
	protected Class<?> getBeanClass(Element element) {
		return User.class;
	}

	@Override
	protected void doParse(Element element, ParserContext parserContext, BeanDefinitionBuilder builder) {
		String userName = element.getAttribute("userName");
		String email = element.getAttribute("email");
		String password = element.getAttribute("password");

		if (StringUtils.hasText(userName)){
			builder.addPropertyValue("userName", userName);
		}

		if (StringUtils.hasText(email)){
			builder.addPropertyValue("email", email);
		}

		if (StringUtils.hasText(password)){
			builder.addPropertyValue("password",password);
		}

	}
}
