
class Solution {
    public static int largest(int[] arr) {
        // code here
        int left = arr[0];
        
        for(int i =0; i<arr.length;i++){
            if(arr[i]> left){
                left = arr[i];
            }
        }
        return left;
        
    }
}
