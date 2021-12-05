public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        System.out.println("Имя волка: " + wolf.name);
        System.out.println("Пол волка: " + wolf.gender);
        System.out.println("Цвет волка: " + wolf.color);
        wolf.weight = 67.4f;
        System.out.println("Вес волка: " + wolf.weight);
        wolf.age = 14;
        System.out.println("Возраст волка: " + wolf.age);

        wolf.run();
        wolf.sit();
        wolf.go();
        wolf.howl();
        wolf.hunt();
    }
}