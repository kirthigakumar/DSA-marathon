class Solution1{
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
         int min=0;
         int max=arr[n-1]-arr[0];
         int ans=0;
         while(min<=max){
             int mid=(min+max)/2;
             if(isallcowplaced(arr,k,mid)){
                 ans=mid;
                 min=mid+1;
             }
             else{
                 max=mid-1;
             }
         }
         return ans;
    }    
        static boolean isallcowplaced(int[]arr,int k,int mid){
            int count=1,lastcow=arr[0];
            for(int i=1;i<arr.length;i++){
                if(arr[i]-lastcow>=mid){
                    count++;
                    lastcow=arr[i];
      
                if(count>=k){
                    return true;
                }
                }
            }
            return false;
        }
         
    }

