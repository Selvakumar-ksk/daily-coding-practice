class Solution {
    public boolean judgeCircle(String moves) {
        int couting = 0;
        for(int i = 0; i< moves.length(); i++) {
            if(moves.charAt(i) == 'U') 
                couting += 1000;
            else if(moves.charAt(i) == 'D')
                couting -= 1000;
            else if(moves.charAt(i) == 'L')
                couting += 1;
            else if(moves.charAt(i) == 'R')
                couting -= 1;
            else return false;
        }
        if(couting == 0) return true;
        else return false;
    }
}