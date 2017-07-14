package chapter3.assemble.lunch;

import chapter3.assemble.customannotation.Cold;
import chapter3.assemble.customannotation.Fruity;
import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/14.
 */
@Component
@Cold
@Fruity
public class Popsicle implements Dessert {
}
