#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int sum=0;
    vector<int>allSum;
    Solution(vector<int>& w) {
        for(int ele: w){
            sum+=ele;
            allSum.push_back(sum);
        }
    }
    
    int pickIndex() {
        int randomNumber=(rand()%sum)+1;
        return binarySearch(randomNumber);
    }
    
    int binarySearch(int val){
        int start=0; int end=allSum.size()-1;
        while(start<end){
            int mid= start + (end-start)/2;
            
            if(allSum[mid] < val) start=mid+1;
            else end=mid;
        }
        return start; 
    }
};

/**
 * Your Solution object will be instantiated and called as such:
 * Solution* obj = new Solution(w);
 * int param_1 = obj->pickIndex();
 */