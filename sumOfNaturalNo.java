/**
 * sumOfNaturalNo
 */
import java.util.*;
public class sumOfNaturalNo {
public static void main(String[] args) {
    int sum=0;
    Scanner sc =new Scanner(System.in);
    System.out.println("enter number");
    int n = sc.nextInt();
    

    for(int i=0 ; i<=n ;i++){
         sum += i;
        //  System.out.println(sum);
    }
    System.out.println(sum);
    sc.close();
}
    
}