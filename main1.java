import java.util.Scanner;
class main1{
    public static void main(String[] args){
     System.out.println("input");
     Scanner scan=new Scanner(System.in);
     int a= scan.nextInt();
     int b= scan.nextInt();
     int c= scan.nextInt();
     if(a+b+c==180){
        System.out.println("Triangle can be formed");
     }
     else{
        System.out.println("triangle can not be formed");
     }
    }
}