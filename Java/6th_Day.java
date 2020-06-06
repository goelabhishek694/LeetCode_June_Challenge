class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(int[] a, int[] b)->{
            if(a[0]==b[0]) return b[1]-a[1];
            return a[0]-b[0];
        });
        int n=people.length;
        int[][] arr= new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=-1;
            arr[i][1]=-1;
            }
        // ans[people[0][1]][0]=people[0][0];
        // ans[people[0][1]][1]=people[0][1];
        for(int i=0;i<n;i++){
            int count=people[i][1];
            for(int j=0;j<n;j++){
                if(count==0 && arr[j][0]==-1){
                    arr[j][0]=people[i][0];
                    arr[j][1]=people[i][1];
                    break;
                }
                if(arr[j][0]==-1 || arr[j][0] >= people[i][0]){
                    count-=1;
                }
            }
        }
        return arr;
    }
}