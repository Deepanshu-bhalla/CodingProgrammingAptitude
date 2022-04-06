import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FirstNegNumber {
    static int[] getFirstNeg(int[] arr, int k){
        Queue<Integer> queue = new ArrayDeque<>();
        int a = 0;
        int[] res = new int[arr.length-k+1];
        int i=0,j=0;
        while (j<arr.length){
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(queue.size()==0){
                    res[a++] = 0;
                }
                else {
                    res[a++] = queue.peek();
                    if(arr[i]==queue.peek()){
                        queue.poll();
                    }
                }
                i++;
                j++;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int[] arr = {-12,-1,-7,8,-15,30,16,28};
        int[] res = getFirstNeg(arr, 3);
        System.out.println(Arrays.toString(res));

    }
}
