public class MaxSumSubArraySizeK {
    static int getMaxSum(int[] arr, int k){
        int i=0,j=0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while (j<arr.length){
            sum += arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(max,sum);
                sum -= arr[i];
                i++;
                j++;
            }
        }
      return max;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,9,7,1};
        System.out.println(getMaxSum(arr, 3));

    }
}
