import java.util.Scanner;
class size{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int day=scan.nextInt();
        switch(day)
        {
          case 29:
            System.out.println("SMALL");
            break;
          case 30:
            System.out.println("medium");
            break;
          case 38:
            System.out.println("large");
            break;
          case 42:
            System.out.println("Xlarge");
            break;
          default:
            System.out.println("invalid input");
            break;
        }
    }
}