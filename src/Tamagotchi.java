public class Tamagotchi {

    public String name;
    public int age;
    public int mood;
    public int energy;

    public Tamagotchi(String name, int age, int mood, int energy) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.energy = energy;
    }

    public void feed() {

    }

    public void playGames() {

    }

    public void putToBed() {

    }

    public void giveBath() {

    }

    public void gameOptions() {
        System.out.println("Hello, what would you like to do with " + this.name + "?");
        System.out.println("please choose between these following options:");
        System.out.println("Press 1 - to feed " + "Press 2 - to play games " + "Press 3 - to put to bed " + "Press 4 - to give bath");
    }

}
