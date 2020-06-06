
class Solution {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<s.length && i<j;i++, j--){
            char temp; char front=s[i]; char last=s[j];
            temp=front;
            front=last;
            last=temp;
            s[i]=front; s[j]=last;
        }
        
    }
}