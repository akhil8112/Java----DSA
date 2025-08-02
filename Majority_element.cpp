#include <iostream>
#include <vector>
using namespace std;

int majorityElementUsingMooreVotingAlgo(vector<int> nums){
    int freq=0;
    int ans = 0;

    for(int i = 0; i<nums.size(); i++){
        if(freq == 0){
            ans = nums[i];
        }
        if(ans == nums[i]){
            freq++;
        }else{
            freq--;
        }
    }
    return ans;               //TC : O(n)  this is a optimize way
}

int main(){
    vector<int> nums = {1,2,2,1,1,1};
    cout << majorityElementUsingMooreVotingAlgo(nums);             //majority element comes n/2 times in array and only one majority element exist
    return 0;                                                      //leetCode 169
}