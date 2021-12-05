public class Wolf {
    private String gender = "male";
    private String name = "Akella";
    private float weight = 65.8f;
    private int age = 19;
    private String color = "gray";

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст.");
        } else {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


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