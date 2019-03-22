import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        MyDeque<Integer> md = new MyDeque<Integer>();
        System.out.println(md.toString());
        for (int i = 0; i < 1000; i++) {
            md.addFirst(i);
        }
        for(int i = 0; i <2000;i++)
           System.out.println(md.removeFirst());
    }
}