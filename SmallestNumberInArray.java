public class SmallestNumberInArray {
    public static int getNumber(int number[]){
        int samllest= Integer.MAX_VALUE;
            for(int i=0 ;i<number.length;i++){
                    if (number[i]<samllest) {
                         samllest = number[i];
                        
                    }

            }
            return samllest;
    };
    public static int geNumber(int number[]){
        int largest= Integer.MIN_VALUE;
             for(int i=0; i<number.length; i++){
                    if(number[i]>largest)  {
                          largest =number[i];
                    }
             }
             return largest;
    }



    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
        System.out.println("samllest no is : "+ getNumber(number));
        System.out.println("largest number is : "+ geNumber(number));
    }
     
}
