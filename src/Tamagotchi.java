public class Tamagotchi {

    public String name;
    public int age;
    public int energy;
    public String color;

    public Tamagotchi(String name, int age, int energy, String color) {
        this.name = name;
        this.age = age;
        this.energy = energy;
        this.color = color;
    }

    public void feed() {
        System.out.println(this.name + " loves to eat 😍");

        boolean feed = true;
        if (feed) {
            String energyIncrease = energy + "";

            System.out.println(this.name + " is now full" + energyIncrease);

        }

    }

    public void playGames() {
        System.out.println("You're throwing the ball and " + this.name + " is running after it, trying to catch it");


        boolean playGames = true;
        if (playGames) {
            int energyDecrease = energy - 5;

            System.out.println(this.name + " is now a little tired 🥱" + energyDecrease);

        }

    }

    public void putToBed() {
        System.out.println(this.name + " is now sleeping. Zzzzz 😴");

        boolean putToBed = true;
        if (putToBed) {
            int energyIncrease = energy + 5;

            System.out.println(this.name + " feels refreshed after sleeping" + energyIncrease);

        }

    }

    public void giveBath() {
        System.out.println(this.name + " loves hot and long baths 🥰");
        System.out.println(this.name + " is now all fresh and clean");

    }


    @Override
    public String toString() {
        return "Tamagotchi{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", energy=" + energy +
                ", color='" + color + '\'' +
                '}';
    }

}
