#include <iostream>
#include <string>
using namespace std;

void printSubset(string str, string subset){

    //Base condition when string is empty
    if(str.size()==0){
        cout<<subset<<", ";
        return;
    }

    //Extracting first character to take decision YES or NO
    char ch = str[0];

    //for YES 
    printSubset(str.substr(1,str.size()-1),subset+ch);

    //for NO
    printSubset(str.substr(1,str.size()-1),subset);
}
int main(){
    string  str = "abc";
    string subset = "";
    printSubset(str,subset);
    return 0;
}