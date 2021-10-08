public class Dog extends Tamagotchi {

    public String dogSound;

    public Dog(String name, int age, int energy, String color, String dogSound) {
        super(name, age, energy, color);
        this.dogSound = dogSound;
    }

    @Override
    public String toString() {
        return "Dog{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void rollAround() {
        System.out.println("Your dog just rolled around ❤");

    }

    public void printDogsDetail(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Color:" + this.color);
        System.out.println("Energy:" + this.energy);
    }


}
