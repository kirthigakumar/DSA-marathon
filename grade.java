import java.util.Scanner;
class grade{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        if(a>=90){
            System.out.println("GRADE A");
        }
        else if(a>=80){
            System.out.println("GRADE B");
        }
        else if(a>=60){
            System.out.println("GRADE C");
        }
        else if(a>=35){
            System.out.println("GRADE D");
        }
        else{
            System.out.println("fail");
        }
    }
}