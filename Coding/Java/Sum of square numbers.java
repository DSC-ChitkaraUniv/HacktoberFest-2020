class Solution {
    public boolean judgeSquareSum(int c) {
        double sqr = Math.sqrt(c);
        if(sqr == (int)sqr) return true;
        for(int i = 0; i < sqr; i++) {
            double x = Math.sqrt(c - i*i);
            if(x == (int)x) return true;
        }
        return false;
    }
}
