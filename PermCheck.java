import java.util.Arrays;

public class PermCheck{

    public static int solution(int[] A){

        int i = 0;
        Arrays.sort(A);
        

        while (i < A.length){
            if (A[i] != i + 1)
                return 0;
                
            i++;
        }

        return 1;
    }

    public static void main(String args[]){
        System.out.println(solution(new int[] {4, 1, 3, 2})); // 1
        System.out.println(solution(new int[] {4, 1, 3})); // 0
        System.out.println(solution(new int[] {1, 1})); // 0
    }
}