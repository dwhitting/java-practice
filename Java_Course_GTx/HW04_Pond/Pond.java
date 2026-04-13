public class Pond {
    public void main(String[] args) {

        Frog Peepo = new Frog("Peepo");
        Frog Pepe = new Frog("Pepe", 10, 15.0);
        Frog Peepaw = new Frog("Peepaw", 4.6, 5.0);
        Frog Drew = new Frog("Drew", 10, 10);



        Fly fly1 = new Fly(1, 3.0);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly();

        Frog.species = "1331 Frogs";
        System.out.println(Peepo.toString());
        Peepo.eat(fly2);
        System.out.println(fly2.toString());
        Peepo.grow(8);
        Peepo.eat(fly2);
        System.out.println(fly2.toString());
        System.out.println(Peepo.toString());
        System.out.println(Drew.toString());
        Peepaw.grow(4);
        System.out.println(Peepaw.toString());
        System.out.println(Pepe.toString());


    }
}