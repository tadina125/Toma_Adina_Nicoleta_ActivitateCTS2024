package classes;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String food) {
        System.out.printf("The lion " + this.getName() + " eats " + food+ "\n");

    }
}
