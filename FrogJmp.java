public class FrogJmp {
    public static int solution(int X, int Y, int D){

        int diff = Y - X;

        if (diff % D == 0)
            return diff / D;
        else 
            return diff / D + 1;
    }

    public static void main(String args[]){
        
        System.out.println(solution(10, 85, 30));
        System.out.println(solution(1, 10, 3));
        System.out.println(solution(1, 1000000000, 2));
    }
}