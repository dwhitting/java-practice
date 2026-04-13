public class test {

    public void main(String[] args) {

        Dog tDog = new Dog("tDog", 30,6,30);
        Dog tDog2 = new Dog("tDog2", 2, 2, 30);
        Cat tCat = new Cat("tCat", 3, 5, 2);
        Cat tCat2 = new Cat("tCat2", 2, 7, 7);

        System.out.println(tCat.equals(tCat2));
        //tCat.speak();

    }

}