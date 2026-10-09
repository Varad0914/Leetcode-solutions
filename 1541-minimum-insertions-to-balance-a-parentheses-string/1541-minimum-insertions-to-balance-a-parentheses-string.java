class Solution {
    public int minInsertions(String s) {
        int n = s.length();
        int depth = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                depth++;
            } else {
                if (i + 1 < n && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    cnt++;
                }

                if (depth > 0) {
                    depth--;
                } else {
                    cnt++;
                }
            }
        }
        return cnt + (depth * 2);
    }
}