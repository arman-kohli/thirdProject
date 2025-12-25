
class User{


  // gira ticket no 102
  public static void findSubtract(int a,int b){
    int subtract=a-b;
    System.out.println(subtract);
  }
  public static void FindSum(int a,int b){
    int sum=a+b;
    System.out.println(sum);
    System.out.println("this one is sum");
  }
  public static void main(String args[]){
    findSubtract(20, 10);
  
    FindSum(2, 4);
       System.out.println("this one is the first");
       for(int i=0;i<=5;i++){
        for(int j=0;j<=i;j++){
          System.out.print(" *");
        }
        System.out.println();
       }
     }
  }
