public class BinaryGap{
    public static int solution(int N){

        int gap = 0;
        int longestGap = 0;
        char binaryStr[] = Integer.toBinaryString(N).toCharArray();

        for (int i = 0; i < binaryStr.length; i++) {
            if (binaryStr[i] == '0') 
                gap += 1;
            else {
                if (gap > longestGap)
                    longestGap = gap;
                gap = 0;
            }
        }

        return longestGap;
    }

    public static void main(String args[])  {
        
        System.out.println(solution(9));
        System.out.println(solution(529));
        System.out.println(solution(20));
        System.out.println(solution(15));
        System.out.println(solution(32));
    }
}