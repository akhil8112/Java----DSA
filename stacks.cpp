#include <iostream>
#include <stack>

using namespace std;
void pushatbottom(stack<int>& s,int val){
    if(s.empty()){
        s.push(val);
        return;
    }
    int top=s.top();
    s.pop();
    pushatbottom(s,val);
    s.push(top);
}

void reverseString()

int main(){
    stack<int> s;
    s.push(1);
    s.push(2);
    s.push(3);
    
    pushatbottom(s,5);
    
    while(!s.empty()){
        cout<<s.top()<<" ";
        s.pop();
    }
}
        
     