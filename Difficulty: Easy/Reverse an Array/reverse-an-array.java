class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int [] arrs = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            arrs[i]=arr[i];
        }
        int index=0;
        for(int i=arrs.length-1;i>=0; i--){
            arr[index]=arrs[i];
            index++;
        }
    }
}