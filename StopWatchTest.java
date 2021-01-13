import java.util.Random;
public class StopWatchTest {
    public static void main(String[] args) {

        int[] arr = new int[100000];

        StopWatch timer = new StopWatch();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        timer.start();
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                    int temp=arr[minIndex];
                    arr[minIndex]=arr[i];
                    arr[i]=temp;
            }
        }
        }
        timer.stop();
        System.out.println(timer.getElapsedTime());
    }
}


