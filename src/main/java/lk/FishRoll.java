package lk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FishRoll")
public class FishRoll implements Bakery{

    @Override
    @Primary
    public void myPreference() {
        System.out.println("I preferred FishRoll");
    }


}
