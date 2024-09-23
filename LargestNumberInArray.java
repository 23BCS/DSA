import java.util.*;

public class LargestNumberInArray {
    
    public static int getNumber(int number[]){
        int largest= Integer.MIN_VALUE;
             for(int i=0; i<number.length; i++){
                    if(number[i]>largest)  {
                          largest =number[i];
                    }
             }
             return largest;
    }
    
    
    
    
    
    public static void main(String[] args) {
        int number[] ={1,2,3,4,5,6,7,8};
        System.out.println("largest number is : "+ getNumber(number));
    }
}
