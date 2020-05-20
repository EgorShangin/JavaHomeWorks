public class Dog extends Animal {
    public Dog(String name) {
        super("Пёс " + name);
        this.limitDistance = 500;
        this.limitJump = 0.5;
        this.limitSwim = 10;
    }

}
