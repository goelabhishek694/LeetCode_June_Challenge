#include<iostream>
#include<vector>
using namespace std;

int searchInsert(vector<int>& nums, int target) {
    int j=0;    
    while(j<=nums.size()-1){
        if(nums[j]>=target) return j;
        j++;
    }
    
    return j; 
}

int main(){
    vector<int>nums={1,2,3,5,4,8};
    int target=4;
    int ans=searchInsert(nums,target);
    cout<<ans<<endl;
}