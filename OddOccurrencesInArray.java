import java.util.Arrays;

public class OddOccurrencesInArray{

    public static int solution(int[] A){

        if (A.length == 1)
            return A[0];

        Arrays.sort(A);

        if (A[A.length - 1] != A[A.length - 2])
            return A[A.length - 1];

        for (int i = 0; i < A.length - 2; i+=2) {
            if (A[i] != A[i + 1])
                return A[i];
        }

        return 1;
    }

    public static void main(String args[]){
        System.out.println(solution(new int[] {9, 3, 9, 3, 9, 7 ,9}));
        System.out.println(solution(new int[] {1, 2, 3, 1, 2}));
        System.out.println(solution(new int[] {42}));
    }
}