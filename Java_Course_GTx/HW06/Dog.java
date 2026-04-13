public class Dog extends Pet {
    private double droolRate;

    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        if (droolRate <= 0.0) {
            this.droolRate = 0.5;
        } else {
            this.droolRate = droolRate;
        }
    }
    public Dog(String name, double health, int painLevel) {
        this(name, health, painLevel, 5.0);
    }

    public double getDroolRate() {
        return this.droolRate;
    }
    public int treat() {
        int retVal = 0;
        double tempVal = 0.0;
        if (droolRate < 3.5) {
            tempVal =  ((this.getPainLevel() *2) / this.getHealth());
        } else if ((droolRate >= 3.5) && (droolRate <= 7.5)) {
            tempVal = (this.getPainLevel() / this.getHealth());
        } else {
            tempVal = (this.getPainLevel() / (this.getHealth() * 2));
        }

        if (tempVal % 1 != 0) {
            tempVal += 1;
        }

        retVal = (int)tempVal;
        super.heal();
        return retVal;
    }

    public void speak() {
        super.speak();
        for (int i = 0; i < this.getPainLevel(); i++) {
            if (this.getPainLevel() > 5) {
                System.out.printf("bark ".toUpperCase());
            } else {
                System.out.printf("bark ");
            }
        }
        System.out.printf("\n");
    }

    public boolean equals(Object o) {
        Dog inObj = (Dog)o;
        if (super.equals(o) && this.droolRate == inObj.droolRate) {
            return true;
        } else {
            return false;
        }
    }
}