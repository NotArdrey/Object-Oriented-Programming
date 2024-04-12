public class Reptile extends Animal {
    public Reptile(String name, int age, double weight) {
        super(name, age, weight);
    }
    @Override
    public void makeSound() {
        System.out.println("Reptile sound");
    }
    @Override
    public void eat() {
        System.out.println("Reptile is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Reptile is sleeping");
    }
}