public class dog extends Canine {
    protected String name;
    public dog(String name, double size) {
        super(size);
        this.name = name;
    }

    public  void fetch() {
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }

    public String toString() {
        return ("Name: " + name + "; size: " + size);
    }

    public void groom() {}

    public boolean equals(Object o) {
        boolean result = true;
        if (!(o instanceof dog)) {
            result = false;
        }
        return result;
    }

    public static void main() {
        dog spot = new dog("Spot", 9.6);
        spot.bark();

        dog mutt = new dog("Mutt", 10.0);

        System.out.println(mutt.equals(spot));
    }

}

