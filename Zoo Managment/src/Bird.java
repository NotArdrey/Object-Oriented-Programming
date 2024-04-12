public class Bird extends Animal implements Flyable{
    public Bird(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public void makeSound() {
        System.out.println("Tweet Tweet");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Bird is sleeping");
    }
    @Override
    public void fly() {
        System.out.println("Bord is flying");
    }
}



