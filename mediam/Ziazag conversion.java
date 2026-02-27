class Solution {
    public String convert(String s, int numRows) {
        
       
        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        StringBuilder result = new StringBuilder();
        int n = s.length();
       
        int cycleLen = 2 * numRows - 2;

        
        for (int i = 0; i < numRows; i++) {
           
            for (int j = i; j < n; j += cycleLen) {
                
                
                result.append(s.charAt(j));

                
                if (i != 0 && i != numRows - 1) {
                    
                    
                    int diagIndex = j + cycleLen - 2 * i;
                    
                    if (diagIndex < n) {
                        result.append(s.charAt(diagIndex));
                    }
                }
            }
        }

        return result.toString();
    }
}
