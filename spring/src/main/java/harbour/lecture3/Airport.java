package harbour.lecture3;

import java.io.FilterOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Airport {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Airport.class);

        System.out.println("...");
    }

}
