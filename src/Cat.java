public class Cat extends Tamagotchi {

    public String catSound;

    public Cat(String name, int age, int energy, String color, String catSound) {
        super(name, age, energy, color);
        this.catSound = catSound;
    }

    @Override
    public String toString() {
        return "Cat{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

    public void CatchMouse() {
        System.out.println("Your cat just caught a huge mouse, and is now showing it off");

        return;
    }

    public void printCatsDetail(){
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        System.out.println("Color:" + this.color);
        System.out.println("Energy:" + this.energy);
    }



}
