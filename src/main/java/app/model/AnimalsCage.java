package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {


    private Animal animal;

    private Timer t;
    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal,@Qualifier("timer") Timer t) {
        this.animal = animal;
        this.t = t;
    }

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
