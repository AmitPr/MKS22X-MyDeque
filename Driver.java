import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        MyDeque md = new MyDeque<Integer>();
        System.out.println(md.toString());
        for (int i = 0; i < 1000; i++) {
            md.addFirst(i);
        }
        md.addLast(1000);
        md.removeFirst();
        md.removeLast();
        System.out.println(Arrays.toString(md.data));
    }
}