package chapter4.critic;

/**
 * Created by liyu on 2017/7/24.
 */
public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl(){};

    private String[] criticismPool;

    public void setCriticismPool(String[] criticismPool){
        this.criticismPool = criticismPool;
    }

    public String getCriticism(){
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }
}
