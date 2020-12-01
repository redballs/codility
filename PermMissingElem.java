import java.util.Arrays;

public class PermMissingElem {

    public static int solution(int[] A){

        int missingElem = 0;
        Arrays.sort(A);

        if (A.length == 0)
            return 1;
        else if (A.length == 1) {
            if (A[0] % 2 == 0)
                return 1;
            else
                return 2;
        }
        else if (A.length == 2)
            return 6 - A[1] - A[0];
        else if (A[0] + A[A.length - 1] == A[A.length - 1] + 2)
            return 1;
        else if (A[A.length - 1] == A.length)
            return A[A.length - 1] + 1;
        else {
            int i = 0;
            while ((A[i] + A[i+1]) % 2 != 0){
                i++;
                missingElem = (A[i] + A[i+1]) / 2;
            }
        }

        return missingElem;
    }

    public static void main(String args[]){
        System.out.println(solution(new int[] {3,2}));
        System.out.println(solution(new int[] {1})); 
        System.out.println(solution(new int[] {2, 3, 1, 5})); // 1 2 3   5
        System.out.println(solution(new int[] {4, 3, 2, 5})); //   2 3 4 5
        System.out.println(solution(new int[] {4, 3, 2, 1})); // 1 2 3 4
    }
}