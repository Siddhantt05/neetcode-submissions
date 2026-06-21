class Solution {
    static int bin(int [] num, int val , int i , int j){
        if(i>j) return -1;
        int mid= (i+j)/2;
        if(num[mid]<val){
            return bin(num,val,mid+1,j);
        }
        if(num[mid]>val) return bin(num,val,i,mid-1);
        return mid;
    }
    public int[] twoSum(int[] numbers, int target) {
        int [] ans = new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int search = target - numbers[i];
            int index =bin(numbers,search , 0, numbers.length-1);
            if(index!=-1){
                ans[0]=i+1;
                ans[1]=index+1;
                return ans;
            }
        }
        return ans;
    }
}
