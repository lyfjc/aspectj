package concert;

public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl(){}

    public String getCriticism() {
        int i=(int)(Math.random()*criticismPool.length);
        return criticismPool[i];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }

    private String[] criticismPool;
}
