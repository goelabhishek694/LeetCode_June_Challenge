import java.util.*; 
class wipro{

    static void ascDescOrder(int[] arr){
        int n = arr.length;
        Arrays.sort(arr); 

        for (int i = 0; i < n / 2; i++){
            System.out.print(arr[i]);
        } 

        for (int k = n - 1; k >= n / 2; k--){
            System.out.print(arr[j]); 
        }
    }

    public static int countNoOf_1(int num){
        int [] arr =new int[num+1];
        for(int i=0;i<=num;i++){
            arr[i]=arr[(i)&(i-1)]+1;
        }

        if(arr[num-1]!=0) return arr[num-1]
        return -1;
    }

    public static void factors(int num){
        for(int i=1;i<num/2;i++){
            if(num%i==0) System.out.println(i+" ");
        }
    }





}