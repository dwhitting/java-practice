public class Fly {
    private double mass;
    private  double speed;

    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    public Fly(double mass) {
        this(mass, 10.0);
    }

    public Fly() {
        this(5.0, 10.0);
    }

    public double getMass() {
        return this.mass;
    }
    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return this.speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String toString() {
        if (mass == 0) {
            return String.format("I'm dead, but I used to be a fly with speed of %.2f.", this.speed);
        } else {
            return  String.format("I'm a speedy fly with %.2f speed and %.2f mass.", this.speed, this.mass);
        }
    }

    public void grow (int mass) {
        for (int i = 1; i <= mass; i++) {
            if (this.mass < 20) {
                this.mass += 1;
                this.speed += 1;
            } else {
                this.mass += 1;
                this.speed -= 0.5;
            }
        }
    }

    public boolean isDead() {
        if (this.mass == 0) {
            return true;
        } else {
            return false;
        }
    }

}