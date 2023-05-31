package springproject.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springproject/autowiring/config.xml");
    	Certificate cer = context.getBean("cer",Certificate.class);
    	Student std = context.getBean("std",Student.class);
    	System.out.println(cer);
    	System.out.println(std);
    }
}
