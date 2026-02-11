//simple for loop
class ForLoopExample{
    public static void main(String[] args){
      for(int i = 1; i <= 5; i++){
         System.out.println(i);
      }  
    }
}

//for loop counting down
class ForLoopCountDown{
    public static void main(String[] args){
        for(int i = 5; i >= 1; i--){
            System.out.println(i);
        }
    }
}

class EvenNumbers{
    public static void main(String[] args){
        for(int i = 0; i <= 50; i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
}

//do while loop
class DoWhileExample{
    public static void main(String[] args){
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <=5);
    }
}