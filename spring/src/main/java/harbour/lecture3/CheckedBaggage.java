package harbour.lecture3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CheckedBaggage {

    public CheckedBaggage() {
        System.out.println("CheckedBaggage was created");
    }
}
