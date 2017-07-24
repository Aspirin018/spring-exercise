package chapter4.concert2;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by liyu on 2017/7/24.
 */
public class Audience {
//    public void silenceCellPhones(){
//        System.out.println("silence cell phones");
//    }
//    public void takeSeats(){
//        System.out.println("taking seats");
//    }
//    public void applause(){
//        System.out.println("clap clap clap");
//    }
//    public void demandRefund(){
//        System.out.println("demanding a refund");
//    }
    public void watchperformance(ProceedingJoinPoint jp){
        try {
        System.out.println("silence cell phones");
        System.out.println("taking seats");
        jp.proceed();
        System.out.println("clap clap clap");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("demanding a refund");
        }
    }
}
