class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Bird extends Animal {
    private String featherType;

    public Bird(String name, int age, String featherType) {
        super(name, age);
        this.featherType = featherType;
    }

    public void fly() {
        System.out.println("Flying...");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Feather Type: " + featherType);
    }
}

class Fish extends Animal {
    private String finType;

    public Fish(String name, int age, String finType) {
        super(name, age);
        this.finType = finType;
    }

    public void swim() {
        System.out.println("Swimming...");
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fin Type: " + finType);
    }
}

public class Test {
    public static void main(String[] args) {
        Bird sparrow = new Bird("Sparrow", 2, "Downy");
        Fish salmon = new Fish("Salmon", 3, "Dorsal");

        // Gọi phương thức từ lớp cơ sở và lớp dẫn xuất
        sparrow.displayInfo();
        sparrow.fly();

        salmon.displayInfo();
        salmon.swim();
    }
}
