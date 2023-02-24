package Home_work_4.Arrays.additional;

public class Anomalies {
    public static void main(String[] args) {


        int[] arr = {56, 45, 38, 155, 100, 101};
        {
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] < arr[i+1] ) {

                    System.out.println(arr[i+1]);

                }
            }
        }
    }
}

