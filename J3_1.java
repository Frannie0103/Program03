
import java.util.*;


public class J3_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String binaryString = Integer.toBinaryString(number);
        String hexString = Integer.toHexString(number);
        System.out.println("binary: "+binaryString+" hex: "+hexString);
    }

}