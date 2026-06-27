class recusion{
   static int countdigit(int n){
    if(n==0){
        return 0;
    }
    return 1+countdigit(n/10);
   }
   public static void main(String[] args){
    int n=12345;
    System.out.println(countdigit(n));
   }
}