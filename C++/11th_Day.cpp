#include<iostream>
#include<vector>
using namespace std;

void swap(int a, int b,vector<int>& nums){
    int temp=nums[a];
    nums[a]=nums[b];
    nums[b]=temp;
}

void sortColors(vector<int>& nums) {
    int low=0; int mid=0; int high=nums.size()-1;
    
    while(mid<=high){
        if(nums[mid]==0){
            swap(low,mid,nums);
            low++; mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else if(nums[mid]==2){
            swap(mid,high,nums);
            high--;
        }
    }
}

int main(){
    vector<int>nums={2,0,2,1,1,0};
    sortColors(nums);
}