/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
// Leetcode: https://leetcode.com/problems/first-bad-version/
public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int ans = 1;
        while (start <= end) {
            int mid = start + (end  -start) / 2;

            boolean version = isBadVersion(mid);
            if(version) {
                ans = mid;
                end = mid  - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}