class sieve{
    public static void main(String[] args){
        int L=10;
        int R=20;
        int sum=0;
        int [] a=new int[R+1];
        for(int i=2;i<=R;i++){
            a[i]=1;
        }
        for(int i=2;i*i<=R;i++){
            if(a[i]==1){
                for(int j=i*2;j<=R;j=j+i){
                    a[j]=0;
                }
            }
            for(i=L;i<=R;i++){
                if(a[i]==1){
                    sum=sum+i;
                }
            }
        }
    System.out.println(sum);
    }
}