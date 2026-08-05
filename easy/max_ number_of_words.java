class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String s : sentences) {
         
            String[] words = s.split(" "); 
            if (words.length > maxWords) {
                maxWords = words.length; 
            }
        }
        return maxWords;
    }
}
