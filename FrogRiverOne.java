import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne{
    public static int solution(int X, int A[]){

        Set<Integer> leaves = new HashSet<>();
        int earliestJump = -1;
        
        for (int i = 0; i < A.length; i++) {
            if (!leaves.contains(A[i])){
                leaves.add(A[i]);

            if (leaves.size() == X)
                earliestJump = i;
            }
            
        }

        return earliestJump;
    }

    public static void main(String args[]){

        System.out.println(solution(3, new int[] {1, 3, 1, 3, 2, 1, 3}));
        System.out.println(solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));

    }
}