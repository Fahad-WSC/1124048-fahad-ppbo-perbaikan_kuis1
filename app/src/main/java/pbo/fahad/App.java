package pbo.fahad;
import java.util.ArrayList;
import java.util.Collections;

abstract class Animal {
    private String name;
    private int age;
    private String food;

    public Animal(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

    public abstract String getType();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFood() {
        return food;
    } 

    public void setFood(String food) {
        this.food = food;
    }

    public abstract String printSound();

    public String eat() {
        return name + " is eating " + food;
    }

    public String printData() {
        return "Name: " + name + " | Age: " + age + " | Food: " + food;
    }
}

abstract class LandAnimal extends Animal {
    int numberOfLegs;
    public LandAnimal(String name, int age , String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }


    public String printData() {
        return super.printData() + " | Number of Legs: " + numberOfLegs;
    }    
}

abstract class SeaAnimal extends Animal {
    double maximumDepth;
    public SeaAnimal(String name, int age , String food, double maximumDepth) {
        super(name, age, food);
        this.maximumDepth = maximumDepth;
    }

    public double getMaximumDepth() {
        return maximumDepth;
    }

    public void setMaximumDepth(double maximumDepth) {
        this.maximumDepth = maximumDepth;
    }

    @Override
    public String printData() {
        return super.printData() + " | Maximum Depth: " + maximumDepth;
    }


}

abstract class AirAnimal extends Animal {
    double wingSpan;
    public AirAnimal(String name, int age , String food, double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String printData() {
        return super.printData() + " | Wing Span: " + wingSpan;
    }
}

interface Moveable{
    String move();
}

interface Feedable{
     String eat();
}

class Dog extends LandAnimal implements Moveable, Feedable {
    public Dog (String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Woof Woof";
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String move() {
        return "Dog is running.";
    }
}


class Cat extends LandAnimal implements Moveable, Feedable {
    public Cat (String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow Meow";
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public String move() {
        return "Cat is stalking and walking softly";
    }
}

class Mouse extends LandAnimal implements Moveable, Feedable {
    public Mouse (String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Squeak";
    }

    @Override
    public String getType() {
        return "Mouse";
    }

    @Override
    public String move() {
        return "Mouse is scurrying";
    }
}

class Fish extends SeaAnimal implements Moveable, Feedable {
public Fish (String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Blub Blub";
    }

    @Override
    public String getType() {
        return "Fish";
    }

    @Override
    public String move() {
        return "Fish is swimming rapidly";
    }
}

class Shark extends SeaAnimal implements Moveable, Feedable {
    public Shark (String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Silent Splash";
    }

    @Override
    public String getType() {
        return "Shark";
    }

    @Override
    public String move() {
        return "Shark is gliding through the deep ocean";
    }
}

class Whale extends SeaAnimal implements Moveable, Feedable {
    public Whale (String name, int age, String food, double maximumDepth) {
        super(name, age, food, maximumDepth);
    }

    @Override
    public String printSound() {
        return "Whale Song";
    }

    @Override
    public String getType() {
        return "Whale";
    }

    @Override
    public String move() {
        return "Whale is diving gracefully";
    }
}

class Eagle extends AirAnimal implements Moveable, Feedable {
    public Eagle (String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Screech";
    }

    @Override
    public String getType() {
        return "Eagle";
    }

    @Override
    public String move() {
        return "Eagle is soaring high in the sky";
    }
}

class Parrot extends AirAnimal implements Moveable, Feedable {
    public Parrot (String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Squawk";
    }

    @Override
    public String getType() {
        return "Parrot";
    }

    @Override
    public String move() {
        return "Parrot is fluttering through the trees";
    }
}

class Duck extends AirAnimal implements Moveable, Feedable {
    public Duck (String name, int age, String food, double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Quack Quack";
    }

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String move() {
        return "Duck is flying and paddling";
    }
}

public class App {
    public static void main(String[] args) {
    ArrayList<Animal> animals = new ArrayList<>();

    animals.add(new Dog("Doggy", 1, "Dog Food", 4));
    animals.add(new Cat("Kath", 2, "Cat Food", 4));
    animals.add(new Shark("Sharky", 3, "Meat", 200.0));
    animals.add(new Whale("Wally", 4, "Plankton", 500.0));
    animals.add(new Parrot("Parot", 5, "Seeds", 1.0));
    animals.add(new Duck("Donald", 6, "Duck Food", 1.5));

    
    Collections.sort(animals, new java.util.Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    });

    for (Animal animal : animals) {
        System.out.println("Animal Type: " + animal.getType());
        System.out.println(animal.printData());
        System.out.println("Sound: " + animal.printSound());
        if (animal instanceof Moveable moveable) {
            System.out.println("Movement: " + moveable.move());
        }
        if (animal instanceof Feedable feedable) {
            System.out.println("Eating: " + feedable.eat());
        }
        System.out.println("-----------------------------");
    }


    System.out.println("Sorting animals by name:");
    Collections.sort(animals, new java.util.Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getName().compareTo(a2.getName());
        }
    });
    
    for(Animal animal : animals){
        System.out.println(animal.getName() + " - " + animal.getType() + "Age: " + animal.getAge());
    }

    System.out.println("-----------------------------");
    System.out.println("Sorting animals by age:");
    Collections.sort(animals, new java.util.Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge());
        }
    });

    for(Animal animal : animals){
        System.out.println(animal.getName() + " - " + animal.getType() + "Age: " + animal.getAge());
    }

}
}
    
