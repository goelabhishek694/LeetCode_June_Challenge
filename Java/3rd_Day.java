class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int[]arr=new int[costs.length];
        Arrays.sort(costs,(int[] a, int[] b)->{
            return (a[0]-b[0]) - (a[1]-b[1]);
        });
        int ans=0;
        for(int i=0;i<costs.length;i++){
            ans += (i<(costs.length/2)?costs[i][0]:costs[i][1]);
        }
        
        return ans;
    }
}