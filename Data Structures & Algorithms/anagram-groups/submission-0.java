class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> store = new HashMap<>();

        for (String s : strs) {
            int[] freq = new int[26];

            for (char ch : s.toCharArray()) {
                freq[ch - 'a']++;
            }

            store.computeIfAbsent(Arrays.toString(freq), (f) -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(store.values());
    }
}
