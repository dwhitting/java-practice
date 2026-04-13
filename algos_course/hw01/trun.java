public class trun {

    public static void main(String[] args) {

        ArrayList<String > tvar = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            tvar.addToFront("data " + i);
        }

//        tvar.addToFront("el");
//        tvar.addToFront("tx 2l");
        tvar.removeFromFront();
        tvar.removeFromFront();



        Object[] underArray = tvar.getBackingArray();

        for (int i = 0; i < underArray.length; i++) {
            System.out.println(underArray[i]);
        }



    }
}
