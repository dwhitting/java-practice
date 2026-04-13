import static java.lang.System.out;
public class test {
    public static void main(String[] args) {

        LinkedList<String> test = new LinkedList<>();
        out.println("");

        test.add("string");
        test.add("2string");

        test.add(1, "inString");
        test.add("4thString");

        out.println("");
        //System.out.println(test.remove(0));
        //String catcher = test.remove(0);
        //out.println("");

        for (int i = 0; i < test.size(); i++) {
            out.println(test.get(i));
        }






    }


}