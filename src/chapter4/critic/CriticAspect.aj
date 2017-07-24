package chapter4.critic;

/**
 * Created by liyu on 2017/7/24.
 */
public aspect CriticAspect {
    public CriticAspect(){};

    private CriticismEngine criticismEngine;

    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine = criticismEngine;
    }

    pointcut performance() : execution(* chapter4.critic.Performance.perform(..));

    after() : performance(){
        System.out.println(criticismEngine.getCriticism());
    }
}
