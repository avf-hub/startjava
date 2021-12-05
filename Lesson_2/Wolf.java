public class Wolf {
    String gender = "male";
    String name = "Akella";
    float weight = 65.8f;
    int age = 19;
    String color = "gray";

    public void go() {
        System.out.println("Волк " + name + " идет.");
    }

    public void sit() {
        System.out.println("Волк " + name + " сидит.");
    }

    public void run() {
        System.out.println("Волк " + name + " побежал.");
    }

    public void howl() {
        System.out.println("Волк " + name + " воет.");
    }

    public void hunt() {
        System.out.println("Волк " + name + " охотиться.");
    }
}