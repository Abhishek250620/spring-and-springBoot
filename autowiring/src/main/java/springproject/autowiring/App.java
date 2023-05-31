package springproject.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springproject/autowiring/config.xml");
    	Certificate cer1 = context.getBean("cer1",Certificate.class);
    	Certificate cer2 = context.getBean("cer2",Certificate.class);
    	Student std = context.getBean("std",Student.class);
    	System.out.println(cer1);
    	System.out.println(cer2);
    	System.out.println(std);
    }
}
