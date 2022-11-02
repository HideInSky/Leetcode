import java.util.Arrays;

// 279. Perfect Squares
// 10-27, 1-1

// Given an integer n, return the least number of perfect square numbers that
// sum to n.

// A perfect square is an integer that is the square of an integer; in other
// words,
// it is the product of some integer with itself. For example, 1, 4, 9, and 16
// are
// perfect squares while 3 and 11 are not.

class Solution{
    public int numSquares(int n){
        if (n < 2) return 1;

        int[] M = new int[n+1];
        Arrays.fill(M,0);
        for (int i = 1; i<n+1; i++){
            M[i] = M[i-1]+1;
            for (int j = 2; j*j<=i; j++){
                M[i] = Math.min(M[i], M[i-j*j]+1);
            }
        }
        return M[n];
        
    }
}