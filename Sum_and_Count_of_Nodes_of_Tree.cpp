#include<iostream>
#include<vector>

using namespace std;

class Node{
    public:
    int data;
    Node* left;
    Node* right;

    Node(int data){
        this->data = data;
        left=right = NULL;
    }
};

static int idx = -1;
Node* buildtree(vector<int> nodes){
    idx++;

    if(nodes[idx] == -1){
        return NULL;
    }

    Node* currNode = new Node(nodes[idx]);
    currNode->left = buildtree(nodes);//left Subtree
    currNode->right = buildtree(nodes);//right Subtree

    return currNode;
}

int count(Node* root){
    if(root == NULL){
        return 0;
    }
    int left=count(root->left);
    int right=count(root->right);

    return left + right + 1;
}

int sum(Node* root){
    if(root == NULL){
        return 0;
    }
    int leftSum=sum(root->left);
    int rightSum=sum(root->right);

    return leftSum + rightSum + root->data;
}


int main(){
    vector<int> nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    Node* root=buildtree(nodes);

    cout << count(root) << endl;      //O(n)
    cout << sum(root);                //O(n)
}