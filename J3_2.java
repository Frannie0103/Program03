import java.util.*;


public class J3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = scanner.nextLine();
        String[] array = res.split(" ");
        double a = Double.valueOf(array[0]);
        double b = Double.valueOf(array[2]);
        double result=0;
        char c = array[1].charAt(0);
        switch (c) {
            case '+':
                result=a+b;
                break;
            case '-':
                result=a-b;
                break;
            case 'x':
                result=a*b;
                break;
            case '/':
                result=a/b;
                break;
        }
        System.out.println(a+" "+c+" "+b+" = "+result);
    }

}