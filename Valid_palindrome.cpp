#include <iostream>
using namespace std;

bool validPalindrome(string s){
        int i = 0;
        int j = s.size()-1;

        while(i<j){
            while(i<j && !isalnum(s[i])){
                i++;
            }
            while(i<j && !isalnum(s[j])){
                j--;
            }     
            if(isalnum(s[i]) && isalnum(s[j]) ){
                if(tolower(s[i])!= tolower(s[j])){
                    return false;
                }
            i++;
            j--;
            }
        }
        return true;
}

int main(){
    string s = "A man, a plan, a canal: Panama";
    cout << validPalindrome(s);
    return 0;
}
