import java.util.ArrayList;

public class Arraylist {
   
    public static void main(String[] args) {

        ArrayList a=new ArrayList();
        a.add("hello");
        a.add(1);
        a.add("ani");

        for (Object o : a) {
            System.out.println(o);
        }
        if(a.contains("hello"))
                 {
                     System.out.println("yes");
                 }





    }
}
