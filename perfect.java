
class perfect{
    public static void main(String[] args){
        int n=28;
        int sum=1;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
              sum=sum+i;
            
            if(n/i!=i){
                sum=sum+(n/i);
            }
        }
        }
        //if(n==1) sum=0;
        if(sum==n){
            System.out.println(n+"perfect number ");
        }else{
            System.out.println("not perfect");
        }

}
}

