public class IndexSum {

    public static  int Sum (int number[]){
        int sum=0;
        for(int i=0;i< number.length;i++){
                 sum+= number[i];
        }
      return sum;
    }
    public static  int Sum2 (int number[]){
        int sum=0;
        for(int i=0;i< number.length;i++){
                 sum+= number[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int number[]={1,2,3,4,5,6,7};
       int total =  Sum(number) +  Sum2(number) ;
       System.out.println("Total Sum: " +total);
    }
}
