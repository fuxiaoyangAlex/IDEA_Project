package com_annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationIocBeanTest {
    public static void main(String[] args){
        String xmlPath="com_annotation/beans.xml";
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(xmlPath);
        AnnotationIoCBean annotationIoCBean = (AnnotationIoCBean)ac.getBean("annotationIoCBean");
        annotationIoCBean.execute();
    }
}
