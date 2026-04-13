public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    public static String species;

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.species = "Rare Pepe";

        this.isFroglet = this.checkIfFroglet();
    }

    private boolean checkIfFroglet() {
        boolean internVal = false;
        if (this.age > 1 && this.age < 7) {
            internVal = true;
        }

        return internVal;
    }

    public Frog(String name, double ageInYears, double tongueSpeed) {
        this(name, (int)(ageInYears / 12), tongueSpeed);
        this.isFroglet = this.checkIfFroglet();
    }

    public Frog(String name) {
        this(name, 5, 5.0);
    }

    public void grow(int months) {

        for (int i = 1; i <= months; i++) {
            if (this.age < 12) {
                this.age += 1;
                this.tongueSpeed += 1;
            } else if (this.age >= 30) {
                this.age += 1;
                this.tongueSpeed -= 1;
            } else {
                this.age += 1;
            }
        }

        if (this.tongueSpeed < 5) {
            this.tongueSpeed = 5;
        }
        this.isFroglet = this.checkIfFroglet();
    }

    public void grow() {
        this.age += 1;
        if (this.age < 12) {
            this.tongueSpeed += 1;
        } else if (this.age >= 30) {
            this.tongueSpeed -= 1;
        }
        this.isFroglet = this.checkIfFroglet();
    }

    public void eat(Fly fly) {
        //System.out.println("signal");
        if (fly.getMass() == 0) {
            return;
        }
        if (this.tongueSpeed > fly.getSpeed()) {
            if (fly.getMass() >= (0.5 * this.age)) {
                this.grow();
                fly.setMass(0);
            }
        } else {
            fly.grow(1);
        }
    }

    public String toString() {
        this.isFroglet = this.checkIfFroglet();
        //System.out.println(this.isFroglet);
        //System.out.println(this.age);

        if (this.isFroglet == true) {
            return String.format("My name is %s and I'm a rare froglet! I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        } else {
            return String.format("My name is %s and I'm a rare frog. I'm %d months old and my tongue has a speed of %.2f.", this.name, this.age, this.tongueSpeed);
        }
    }

    public static void setSpecies(String fspecies) {
        species = fspecies;
    }
    public static String getSpecies() {
        return species;
    }


}