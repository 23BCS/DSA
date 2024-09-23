public class LinerSearch {

public static int linerSearch (int number[], int  key){
        for(int i=0; i<number.length; i++){
            if(number[i] == key){
               return i;
            }
           
        }
        return -1;
}

    public static void main(String[] args) {
        int number[] ={1,3,5,7,8,4,10,11,34};
        int key = 34 ;

int index = linerSearch(number, key);
  if(index== -1){
    System.out.print("NOT found");
  }
  else{
    System.out.print("key is at index :" + index);
  }

    }
}
