package chapter4.concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by liyu on 2017/7/24.
 */
@Aspect
public class Audience {
//    @Before("execution(* chapter4.concert.Performance.perform(..))")
//    public void silenceCellPhones(){
//        System.out.println("Silence cell phones");
//    }
//    @Before("execution(* chapter4.concert.Performance.perform(..))")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//    }
//    @AfterReturning("execution(* chapter4.concert.Performance.perform(..))")
//    public void applause(){
//        System.out.println("CLAP CLAP CLAP");
//    }
//    @AfterThrowing("execution(* chapter4.concert.Performance.perform(..))")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }

    @Pointcut("execution(* chpter4.concert.Performance.perform(..))")
    public void performance(){};

    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silence cell phones");
    }
    @Before("performance()")
    public void takeSeats(){
        System.out.println("taking seats");
    }
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("clap clap clap");
    }
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("demanding a refund");
    }
}
