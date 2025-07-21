// You are using GCC
#include <iostream>
#include <list>
#include <queue>
#include <vector>

using namespace std;

class Graph{
    int V;
    list<int>*l;
    
    public:
    Graph(int v){
        this->V=v;
        l=new list<int>[v];
    }
    
    void addedge(int u,int v){
        l[u].push_back(v);
        l[v].push_back(u);
    }
    
    void bfs(){
        queue<int>q;
        vector<bool>vis(V,false);
        q.push(0);
        vis[0]=true;
        
        while(q.size()>0){
            int u=q.front();
            q.pop();
            cout<<u<<" ";
            
            list<int> neighbour=l[u];
            
            for(int v: neighbour){
                if(!vis[u]){
                    vis[u]=true;
                    q.push(v);
                }
            }
        }
    }
};



int main(){
    int edge,conec;
    cin>>edge>>conec;
    Graph graph(edge);
    for(int i=0;i<conec;i++){
        int a,b;
        cin>>a>>b;
        
        graph.addedge(a,b);
    }
    
    graph.bfs();
}