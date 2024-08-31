package lk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ChickenRoll")
public class ChickenRoll implements Bakery{

    @Override
    @Qualifier("Chicken")
    public void myPreference() {
        System.out.println("I preferred ChickenRoll");
    }


}
