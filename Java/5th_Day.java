class Solution {
        private int sum;
        private int[] allSum ;
        public Solution(int[] w) {
            sum=0;
            allSum=new int[w.length];
            for(int i=0;i<w.length;i++){
                sum+=w[i];
                allSum[i]=sum;
            }
        }
        
        public int pickIndex() {
            int randomNumber=(int)Math.random()*sum;
            return binarySearch(randomNumber);
        }
        
       private int binarySearch(int val){
            int start=0; int end=allSum.length-1;
            while(start<end){
                int mid= start + (end-start)/2;
                
                if(allSum[mid] < val) start=mid+1;
                else end=mid;
            }
            return start; 
        }
    };