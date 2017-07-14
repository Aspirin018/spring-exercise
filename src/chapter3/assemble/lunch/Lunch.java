package chapter3.assemble.lunch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/14.
 */
@Component
public class Lunch {
    private Dessert dessert;
    @Autowired
    @Qualifier("iceCream")
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }
}
