import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNegNumber {
    static void getFirstNeg(int[] arr, int k){
        Queue<Integer> queue = new ArrayDeque<>();
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
                    System.out.println(0);
                }
                else {
                    System.out.print(queue.peek()+" ");
                    if(arr[i]==queue.peek()){
                        queue.poll();
                    }
                }
                i++;
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        getFirstNeg(arr, 3);
    }
}
