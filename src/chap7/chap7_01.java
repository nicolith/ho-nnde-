package chap7;

/**
 * Created by simezi on 2015/12/26.
 */
public class chap7_01 {
    public static void main(String[] args) {
        System.out.println(signOf(5));
        System.out.println(signOf(0));
        System.out.println(signOf(-1));

    }

    public static int signOf(int i){
        if (i == 0) {
            return i;
        } else {
            return (i > 0) ? 1 : -1;
        }
    }
}
