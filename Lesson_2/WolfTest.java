public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println(wolf.name);
        System.out.println(wolf.gender);
        System.out.println(wolf.color);
        wolf.weight = 67.4f;
        System.out.println(wolf.weight);
        wolf.age = 14;
        System.out.println(wolf.age);

        wolf.run();
        wolf.sit();
        wolf.go();
        wolf.howl();
        wolf.hunt();
    }
}