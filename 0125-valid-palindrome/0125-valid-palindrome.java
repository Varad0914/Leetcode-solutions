class Solution {
    public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        int st = 0;
        int lt = s.length() - 1;

        while (st <= lt) {

            char currFt = s.charAt(st);
            char currEd = s.charAt(lt);

            if (!Character.isLetterOrDigit(currFt)) {
                st++;
            } 
            else if (!Character.isLetterOrDigit(currEd)) {
                lt--;
            } 
            else {

                if (Character.toLowerCase(currFt) != Character.toLowerCase(currEd)) {
                    return false;
                }

                st++;
                lt--;
            }
        }

        return true;
    }
}