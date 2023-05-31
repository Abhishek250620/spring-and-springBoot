package springproject.stereotypeannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("springproject/stereotypeannotation/config.xml");
    	Ipl ipl=context.getBean("ipl",Ipl.class);
    	System.out.println(ipl);
    }
}
