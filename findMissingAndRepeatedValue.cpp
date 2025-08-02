#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        int n = grid.size();
        unordered_set<int> s;
        vector<int> ans;
        int sum = 0;   // sum of all element of grid
        int a;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
                if (s.find(grid[i][j]) != s.end()) {     //this check that the element is in set or not and if found that element is repeated element
                    a = grid[i][j];
                    ans.push_back(grid[i][j]);
                }
                s.insert(grid[i][j]);
            }
        }
        int exceptSum = (n * n) * (n * n + 1) / 2;    //the real sum of values from 1 to n^2 
        int b = exceptSum + a - sum;                  // formula to find missing value
        ans.push_back(b);

        return ans;
    }
};

int main() {
    Solution sol;

    vector<vector<int>> grid = {    //only one number is missing and only one number is repeated
        {1, 2},
        {2, 4}
    };

    vector<int> result = sol.findMissingAndRepeatedValues(grid);

    cout << "Repeated Number: " << result[0] << endl;
    cout << "Missing Number: " << result[1] << endl;

    return 0;
}
