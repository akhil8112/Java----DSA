#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    int findDuplicate(vector<int>& nums) {       //slow fast pointer approach
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];     // increment by one position
            fast = nums[nums[fast]];   // increment by two position
        } while (slow != fast);          //loop run untill they meet

        slow = nums[0];
        while (slow != fast) {             //find the meeting point and that is a duplicate node
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
};

int main() {
    Solution sol;

    vector<int> nums1 = {1, 3, 4, 2, 2};          //value in array b/t 1,n
    vector<int> nums2 = {3, 1, 3, 4, 2};          //leetcode 287
    vector<int> nums3 = {3, 3, 3, 3, 3};

    cout << "Duplicate in nums1: " << sol.findDuplicate(nums1) << endl;      //TC: O(n) 
    cout << "Duplicate in nums2: " << sol.findDuplicate(nums2) << endl;      //SC: O(1)
    cout << "Duplicate in nums3: " << sol.findDuplicate(nums3) << endl;

    return 0;
}
