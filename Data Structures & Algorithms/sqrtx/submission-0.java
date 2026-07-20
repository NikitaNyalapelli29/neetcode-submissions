class Solution {
    public int mySqrt(int x) {
        // Handle the edge case for 0 directly
        if (x == 0) return 0;
        
        int start = 1;
        int end = x;
        int ans = 0;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // Use division to prevent integer overflow (mid * mid > x)
            if (mid <= x / mid) {
                ans = mid;       // Track the closest valid floor integer
                start = mid + 1; // Try to find a larger value
            } else {
                end = mid - 1;   // The value is too large, search the left half
            }
        }
        
        return ans;
    }
}
