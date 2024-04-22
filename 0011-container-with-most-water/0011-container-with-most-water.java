class Solution {
    public int maxArea(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        
        while (left < right) {
            int width = right - left;
            int height = Math.min(arr[left], arr[right]);
            int curArea = width * height;
            
            if (curArea > maxArea) {
                maxArea = curArea;
            }  
            
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}
