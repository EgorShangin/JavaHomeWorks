public class Cat extends Animal {
    public Cat(String name) {
        super("Кот " + name);
        this.limitDistance = 200;
        this.limitJump = 2;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот " + name + " не умеет плавать!");
    }
}
