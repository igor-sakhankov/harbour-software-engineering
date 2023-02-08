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

        getCharacter();
    }
    private static void getCharacter() {
        var a =  'a';
        var aInt = (int)'a';

        final var lowercaseA = 97;
        if (a == 'a' || a == lowercaseA) {
            System.out.println("dp");
        }

        System.out.println(String.format("%s - character, %s - int presentation", a, aInt));
    }
}
