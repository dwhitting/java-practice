public class Gameplay {
    public void main(String[] args) {

        BlueAstronaut Bob = new BlueAstronaut("Bob", 20, 6, 30);
        BlueAstronaut Heath = new BlueAstronaut("Heath", 30, 3, 21);
        BlueAstronaut Albert = new BlueAstronaut("Albert", 44, 2, 0);
        BlueAstronaut Angel = new BlueAstronaut("Angel", 0, 1, 0);

        RedAstronaut Liam = new RedAstronaut("Liam", 19, "experienced");
        RedAstronaut sus_Pers = new RedAstronaut("Sus Person", 100, "expert");



        Liam.sabotage(Bob);
        System.out.println(Bob.toString());

        Liam.freeze(sus_Pers);
        System.out.println(sus_Pers.toString());

        Liam.freeze(Albert);
        System.out.println(Liam.toString());
        System.out.println(Albert.toString());

        Albert.emergencyMeeting();

        System.out.println("");
        sus_Pers.emergencyMeeting();

        System.out.println("");

        Bob.emergencyMeeting();
        System.out.println(sus_Pers.toString());
        Heath.completeTask();
        System.out.println(Heath.toString());
        Heath.completeTask();
        System.out.println(Heath.toString());
        Heath.completeTask();
        System.out.println(Heath.toString());

        Liam.freeze(Angel);
        System.out.println(Angel.toString());
        System.out.println(Liam.toString());

        Liam.sabotage(Bob);
        Liam.sabotage(Bob);
        System.out.println(Bob.toString());

        Angel.emergencyMeeting();
        System.out.println(Liam.toString());



        /*

        RedAstronaut Tester = new RedAstronaut("Tester");

        RedAstronaut t2 = new RedAstronaut("t2");
        t2.setSusLevel(3);
        RedAstronaut t3 = new RedAstronaut("T3");
        t3.setSusLevel(10);

        BlueAstronaut b1 = new BlueAstronaut("B1");
        BlueAstronaut b2 = new BlueAstronaut("B2");
        b2.setSusLevel(50);

        Tester.emergencyMeeting();
        b1.emergencyMeeting();

        Player[] pArr = RedAstronaut.getPlayers();
        for (Player p : pArr) {
            System.out.printf("name: %s, fro: %b\n",p.getName(), p.isFrozen());
        }
        */


    }
}