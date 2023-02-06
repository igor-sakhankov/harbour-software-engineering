package harbour.lecture3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DispatcherConfiguration {

    @Bean
    @Primary
    PublicPlane getPlaneToAms() {
        return new PublicPlane("AMS");
    }

    @Bean
    PrivatePlane getPlaneToBCN() {
        return new PrivatePlane("BCN");
    }
}
