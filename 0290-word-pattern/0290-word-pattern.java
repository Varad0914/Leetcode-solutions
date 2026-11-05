class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        Map<Character, Integer> index = new HashMap<>();
        Map<String, Integer> wordIndex = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (!Objects.equals(index.put(pattern.charAt(i), i),
                                wordIndex.put(words[i], i))) {
                return false;
            }
        }

        return true;
    }
}