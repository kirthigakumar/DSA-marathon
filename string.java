class string{
    public static void main(String[] args){
        String s="geeksforgeeks";
        int maxcount=0;
        char ans='a';
        for(int i=0;i<s.length();i++){
            int count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>maxcount||count==maxcount&&s.charAt(i)<ans){
                maxcount =count;
                ans=s.charAt(i);
            }
        }
        System.out.println(ans);
    }
}