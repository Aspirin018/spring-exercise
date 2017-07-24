package chapter4.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by liyu on 2017/7/24.
 */
@Aspect
public class EncoreableIntroducer {
    //value指定了哪些类要引入接口，即原有的目标类； defaultImpl表示引入接口的实现类
    @DeclareParents(value = "chapter4.concert.Performance+", defaultImpl = DefaultEncoreable.class)
    public static Encoreable encoreable;//要引入的接口

    //引入接口后，调用委托给被代理的bean还是接口的实现，取决于调用的方法属于谁
}
