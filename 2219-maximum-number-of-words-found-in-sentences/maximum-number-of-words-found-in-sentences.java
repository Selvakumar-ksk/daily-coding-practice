class Solution {
    public int mostWordsFound(String[] sentences) {
      int maxlen=0;
      for(String currstr:sentences){
          int currlength=currstr.split(" ").length;
          if(maxlen<currlength){
            maxlen=currlength;
          }
      }
      return maxlen;  
    }
}