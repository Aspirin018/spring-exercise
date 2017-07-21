package chapter3.assemble.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Created by liyu on 2017/7/20.
 */
public class SpelTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        long time = parser.parseExpression("#{T(System).currentTimeMillis()}").getValue(long.class);
        System.out.println("" + time);
    }
}
