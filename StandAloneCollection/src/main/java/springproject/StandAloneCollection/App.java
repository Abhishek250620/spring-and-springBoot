package springproject.StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext contex = new ClassPathXmlApplicationContext("springproject/StandAloneCollection/config.xml");
    	Employee emp = contex.getBean("emp",Employee.class);
//    	System.out.println(emp.getEmail().getClass());
//    	System.out.println(emp.getName().getClass());
//    	System.out.println(emp.getProperty().getClass());
//    	System.out.println(emp.getVehicle().getClass());
    	System.out.println(emp);
    }
}
