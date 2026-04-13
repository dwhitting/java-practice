public abstract class Pet {
    private String name;
    private double health;
    private int painLevel;

    Pet(String name, double health, int painLevel) {
        this.name = name;
        if (health > 1.0) {
            this.health = 1.0;
        } else if (health < 0.0) {
            this.health = 0.0;
        } else {
            this.health = health;
        }
        if (painLevel > 10) {
            this.painLevel = 10;
        } else if (painLevel < 1) {
            this.painLevel = 1;
        } else {
            this.painLevel = painLevel;
        }
    }

    public String getName() {
        return this.name;
    }
    public double getHealth() {
        return this.health;
    }
    public  int getPainLevel() {
        return this.painLevel;
    }

    public abstract int treat(); // returns time (minutes) taken to treat pet

    public void speak() {
        if (painLevel > 5) {
            String toUpCase = String.format("Hello! My name is %s\n", this.name).toUpperCase();
            System.out.printf("%s", toUpCase);
        } else {
            System.out.printf("Hello! My name is %s\n", this.name);
        }
    }

    public boolean equals(Object o) {
        Pet inObj = (Pet)o;
        if (this.name == inObj.name) {
            return true;
        } else {
            return false;
        }
    }

    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }

}