class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        if(i>j) return false;
        if(i<0 && j<0) return true;
        if(i<0) return true;
        if(j<0) return false;

        while(j>=0 && i>=0){
            if(t.charAt(j)==s.charAt(i)){
                j--; i--;
            }
            else{
                j--;
            }
        }
        
        if(i==-1) return true;
        return false;
    }
}