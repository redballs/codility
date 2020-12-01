public class TapeEquilibrium {

    public static int solution(int[] A){

        long arrSum = 0;

        for (int i = 0; i < A.length; i++) {
            arrSum += A[i];
        }
        
        int minDiff = Integer.MAX_VALUE;
        int currDiff = Integer.MAX_VALUE;
        long firstSliceSum = 0;
        long secondSliceSum = 0;

        for (int i = 0; i < A.length - 1; i++) {
            firstSliceSum += A[i];
            secondSliceSum = arrSum - firstSliceSum;
            currDiff = (int) Math.abs(firstSliceSum - secondSliceSum);
            minDiff = Math.min(currDiff, minDiff);        
        }

        return minDiff;
    }

    public static void main(String args[]){
        System.out.println(solution(new int[] {3, 1, 2, 4, 3}));
    }
}