package chapter4.concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by liyu on 2017/7/24.
 */
@Aspect
public class Audience {
    @Before("execution(* chapter4.concert.Performance.perform(..))")
    public void silenceCellPhones(){
        System.out.println("Silence cell phones");
    }
    @Before("execution(* chapter4.concert.Performance.perform(..))")
    public void takeSeats(){
        System.out.println("Taking seats");
    }
    @AfterReturning("execution(* chapter4.concert.Performance.perform(..))")
    public void applause(){
        System.out.println("CLAP CLAP CLAP");
    }
    @AfterThrowing("execution(* chapter4.concert.Performance.perform(..))")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
