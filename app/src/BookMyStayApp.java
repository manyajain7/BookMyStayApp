import java.util.*;

public class BookMyStayApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.View 2.Exit");
        int ch=sc.nextInt();

        if(ch==1) System.out.println("Viewing rooms");
        else System.out.println("Exit");
    }
}