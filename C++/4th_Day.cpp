#include<iostream>
#include<vector>
using namespace std;

void reverseString(vector<char>& s) {
    for(int i=0,j=s.size()-1;i<s.size() && i<j;i++, j--){
        char temp; char front=s[i]; char last=s[j];
        temp=front;
        front=last;
        last=temp;
        s[i]=front; s[j]=last;
    }
    
}

int main(){
    vector<char>s = { 'h','e','l','l','o' };
    reverseString(s);
}
    
