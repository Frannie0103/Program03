import java.util.*;


public class J3_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a=scanner.next();
        String b=scanner.next();
        StringBuffer str=new StringBuffer("横浜学部学EP");
        int indexa = str.indexOf("学");
        str.insert(indexa, a);

        int indexb = str.lastIndexOf("学");
        str.insert(indexb, b);
        System.out.println(str.toString());
        System.out.println("文字数 "+str.length());
        System.out.println("容量 "+str.capacity());
    }

}