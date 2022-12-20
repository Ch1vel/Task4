package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("animal")
    private Animal animal;
    @Autowired
    @Qualifier("timer")
    private Timer t;

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(t.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return t;
    }
}
