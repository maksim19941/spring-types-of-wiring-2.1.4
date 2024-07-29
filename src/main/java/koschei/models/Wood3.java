package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    @Autowired
    private Rabbit4 rabbit;

    @Autowired
    public void setRabbit(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Autowired
    public Wood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}
