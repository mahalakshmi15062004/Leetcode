class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int n = s.length();

      
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

      
        if (index == n) {
            return 0;
        }
   
        int sign = 1;
       
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            if (s.charAt(index) == '-') {
                sign = -1;
            }
            index++;
        }

       
        int result = 0;
        while (index < n) {
            char ch = s.charAt(index);

         
            if (!Character.isDigit(ch)) {
                break;
            }

            int digit = ch - '0';

            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        
        return result * sign;
    }
}
