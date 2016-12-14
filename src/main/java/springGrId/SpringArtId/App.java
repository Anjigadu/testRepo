package springGrId.SpringArtId;

import java.io.IOException;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml") ;
			
     

         HellowWorld obj = (HellowWorld) context.getBean("helloWorld");

         obj.getMessage();
        
    }
}
