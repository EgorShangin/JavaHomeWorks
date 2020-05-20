public abstract class Animal {
    protected String name;
    protected double limitJump = 0;
    protected int limitSwim = 0;
    protected int limitDistance = 0;
    public Animal() {
        this.name = "empty";
    }
    public Animal(String name){
        this.name = name;
    }
    public void run(int distance){
        if(limitDistance > 0 && distance <= limitDistance){
            System.out.println(this.name + " пробежал " + distance + " метров");
        }
        else{
            System.out.println(this.name + " не может столько пробежать!");
        }
    }
    public void swim(int distance){
        if(limitSwim > 0 && distance <= limitSwim){
            System.out.println(this.name + " проплыл " + distance + " метров");
        }
        else{
            System.out.println(this.name + " не может столько проплыть!");
        }
    }
    public void jump(double height){
        if(limitJump > 0 && height <= limitJump){
            System.out.println(this.name + " подпрыгнул на " + height + " метров");
        }
        else{
            System.out.println(this.name + " не может так прыгнуть!");
        }
    }
}
