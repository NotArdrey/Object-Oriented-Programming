public class Mammal extends Animal {
    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Mammal is sleeping");
    }
}
class Primate extends Mammal {
    public Primate(String name, int age, double weight) {
        super(name, age, weight);
    }
}

class Ape extends Primate implements Climber {
    public Ape(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("climbing");
    }
}


class Monkey extends Primate implements Climber {
    public Monkey(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void climb() {
        System.out.println("climbing");
    }
}


interface Climber {
    void climb();
}
