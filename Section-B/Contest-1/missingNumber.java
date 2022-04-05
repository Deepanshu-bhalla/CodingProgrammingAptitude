class missingNumber{
  static int getMissingNumber(int[] arr,int n){
    int sum = 0;
    int totSum = n * (n-1)/2;
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
    }
    return totSum - sum;
  }
  
  public static void main(String[] args){
    int n = 5;
    int[] arr = {2,1,4,5};
    System.out.println(getMissingNumber(int[] arr));
  }
}
