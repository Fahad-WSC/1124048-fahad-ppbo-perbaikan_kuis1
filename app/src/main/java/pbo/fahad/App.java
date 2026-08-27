package pbo.fahad;

abstract class Hewan {
    private String name;
    private int age;
    private String food;

    public Hewan(String name, int age, String food) {
        this.name = name;
        this.age = age;
        this.food = food;
    }

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

    public abstract void move();

    public String printData() {
        return "Name: " + "|" + name + "|" +"Age: " + "|" + age + "|" + "Food: " + food;
    }
}

class HewanDarat extends Hewan {
    int numberOfLegs;

    public HewanDarat(String name, int age, String food, int numberOfLegs) {
        super(name, age, food);
        this.numberOfLegs = numberOfLegs;
    }

    public void move() {
        System.out.println("Aku hewan darat yang berjalan di darat");
    }

    @Override
    public String printSound() {
        return "ckckckck";
    }

    @Override
    public String printData() {
        return super.printData() + "Number of Legs: " + numberOfLegs;
    }
}

class Anjing extends HewanDarat {
    public Anjing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Guk guk";
    }
}

class Kucing extends HewanDarat {
    public Kucing(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Meow meow";
    }
}

class Tikus extends HewanDarat {
    public Tikus(String name, int age, String food, int numberOfLegs) {
        super(name, age, food, numberOfLegs);
    }

    @Override
    public String printSound() {
        return "Cit cit";
    }
}

class HewanLaut extends Hewan {
    int depth;

    public HewanLaut(String name, int age, String food, int depth) {
        super(name, age, food);
        this.depth = depth;
    }

    public void move() {
        System.out.println("Aku hewan laut");
    }

    @Override
    public String printSound() {
        return "splash splash";
    }

    @Override 
    public String printData() {
        return super.printData() + "Depth: " + depth;
    }
}

class Ikan extends HewanLaut {
    public Ikan(String name, int age, String food, int depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Blub blub";
    }
}

class Hiu extends HewanLaut {
    public Hiu(String name, int age, String food, int depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Splash";
    }
}

class Paus extends HewanLaut {
    public Paus(String name, int age, String food, int depth) {
        super(name, age, food, depth);
    }

    @Override
    public String printSound() {
        return "Whistle";
    }
}

class hewanUdara extends Hewan {
    Double wingSpan;

    public hewanUdara(String name, int age, String food, Double wingSpan) {
        super(name, age, food);
        this.wingSpan = wingSpan;
    }

    public void move() {
        System.out.println("Aku hewan udara");
    }

    @Override
    public String printSound() {
        return "cirp cirp";
    }

    @Override
    public String printData() {
        return super.printData() + "Wing Span: " + wingSpan;
    }
}

class Burung extends hewanUdara {
    public Burung(String name, int age, String food, Double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Cuit cuit";
    }
}   

class Elang extends hewanUdara {
    public Elang(String name, int age, String food, Double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Screech";
    }
}

class Bebek extends hewanUdara {
    public Bebek(String name, int age, String food, Double wingSpan) {
        super(name, age, food, wingSpan);
    }

    @Override
    public String printSound() {
        return "Kwek Kwek";
    }
}



public class App {
    public static void main(String[] args) {
       Hewan[] daftarHewan = new Hewan[] {
        new Anjing("Doggy", 3, "Tulang", 4),
        new Kucing("Milo", 2, "Ikan", 4),
        new Tikus("Jerry", 1, "Keju", 4),   
        new Ikan("Nemo", 1, "Plankton", 15),
        new Hiu("Megalo", 10, "Daging", 500),
        new Paus("Bluey", 20, "Krill", 1000),
        new Burung("Pipit"  , 1, "Biji-bijian", 0.2),
        new Elang("Garuda", 5, "Daging", 2.1),
        new Bebek("Donald", 2, "Dedak", 0.8)
       };

       
       for (Hewan h : daftarHewan) {
        h.move();
        System.out.println(h.printData());
        System.out.println("Suara: " + h.printSound());
        System.out.println("-----------------------------");
       };

    }
}