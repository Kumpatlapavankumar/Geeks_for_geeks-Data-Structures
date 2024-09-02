/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    
    public pair indexes(long v[], long x)
    {
        // Your code goes here
        long first=firstindex(v,x);
        long last=lastindex(v,x);
        if(last==-1){
            return new pair(first,first);
        }
        return new pair(first,last);
    }
    public long firstindex(long[] arr,long x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                if(mid==0 || arr[mid-1]!=x ){
                    return mid;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
     public long lastindex(long[] arr,long x){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                if(mid==high || arr[mid+1]!=x ){
                    return mid;
                }else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
}
