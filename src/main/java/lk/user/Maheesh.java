package lk.user;

import lk.Bakery;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;


public class Maheesh  {
    Bakery bakery;


    public void myFood() {
       bakery.myPreference();
    }

    @Primary
    @Qualifier("Chicken")
    @lk.customAnnotation.Pastry(pastry = "Pastry")
    public void setBakery(Bakery bakery) {
        this.bakery = bakery;
    }
}
