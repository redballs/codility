import java.util.Arrays;

public class CyclicRotation {
    public static int[] solution(int[] A, int K) {

        int output[] = new int[A.length];
        
        for (int i = 0; i < A.length; i++) {
            output[(i + K) % A.length] = A[i];
        }

        return output;
    }
    public static void main(String args[]) {
        System.out.println(Arrays.toString(solution(new int[] { 3, 8, 9, 7, 6 }, 3)));
        System.out.println(Arrays.toString(solution(new int[] { 0, 0, 0 }, 1)));
        System.out.println(Arrays.toString(solution(new int[] { 1, 2, 3, 4}, 4)));
    }
}