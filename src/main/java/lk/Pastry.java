package lk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Pastry")
public class Pastry implements Bakery{


    @Override
    @Primary
    @lk.customAnnotation.Pastry(pastry = "Pastry")
    public void myPreference() {
        System.out.println("I preferred Pastry");
    }

}
