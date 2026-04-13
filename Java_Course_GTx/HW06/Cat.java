public class Cat extends Pet {
    private int miceCaught;

    public Cat(String name, double health, int painLevel, int miceCaught) {
        super(name, health, painLevel);
        if (this.miceCaught < 0) {
            this.miceCaught = 0;
        } else {
            this.miceCaught = miceCaught;
        }
    }
    public Cat(String name, double health, int painLevel) {
        super(name, health, painLevel);
        this.miceCaught = 0;
    }

    public  int getMiceCaught() {
        return this.miceCaught;
    }

    public int treat() {
        int retVal = 0;
        double tempVal = 0.0;
        if (this.miceCaught < 4) {
            System.out.printf("hit %d, %f\n", this.getPainLevel(), this.getHealth());
            tempVal =  ((this.getPainLevel() *2) / this.getHealth());
        } else if ((this.miceCaught >= 4) && (this.miceCaught <= 7)) {
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
        //System.out.println(this.getPainLevel());
        for (int i = 0; i < this.miceCaught; i++) {
            if (this.getPainLevel() > 5) {
                System.out.printf("meow ".toUpperCase());
            } else {
                System.out.printf("meow ");
            }
        }
        System.out.printf("\n");
    }

    public boolean equals(Object o) {
        Cat inObj = (Cat)o;
        if (super.equals(o) && this.miceCaught == inObj.miceCaught) {
            return true;
        } else {
            return false;
        }
    }

}