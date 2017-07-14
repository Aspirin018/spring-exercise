package chapter3.assemble.sessionscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by liyu on 2017/7/14.
 */
@Component
public class StoreService {
    private ShoppingCart shoppingCart;
    private ShoppingCartAsCLass shoppingCartAsCLass;
    @Autowired
    public void setShoppingCart(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }
    @Autowired
    public void setShoppingCartAsCLass(ShoppingCartAsCLass shoppingCartAsCLass){
        this.shoppingCartAsCLass = shoppingCartAsCLass;
    }
}
