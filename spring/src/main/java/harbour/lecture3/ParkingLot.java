package harbour.lecture3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ParkingLot {

    @Autowired
        @Qualifier("getPlaneToBCN")
    Plane publicPlane;
}
