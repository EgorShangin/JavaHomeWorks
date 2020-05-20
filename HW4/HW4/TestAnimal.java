public class TestAnimal {
    public static void main(String[] args) {
        Animal[] arrAnimal = new Animal[3];
        arrAnimal[0] = new Cat("Wiskass");
        arrAnimal[1] = new Dog("Kostyan");
        arrAnimal[2] = new Cats("TestMeow", 300, 3.1);
        for (Animal animal : arrAnimal){
            animal.run(150);
            animal.jump(2);
            animal.swim(11);
        }
    }
}
