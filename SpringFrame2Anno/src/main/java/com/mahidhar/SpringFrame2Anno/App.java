package com.mahidhar.SpringFrame2Anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig_xml.class);
      
      Samsung s7 = factory.getBean(Samsung.class);
      s7.config();
    }
}
