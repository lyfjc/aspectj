package concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Lili implements People {
    private Performance p;
    public void setP(Performance p){
        this.p=p;
    }

    /*public Performance getP() {
        return p;
    }*/

    @Override
    public void doPerform() {
       p.perform();
    }
}
