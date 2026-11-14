class Solution {

    public String encode(List<String> strs) {
        return String.join("_#arpan#_", strs);
    }

    public List<String> decode(String str) {
        return Arrays.asList(str.split("_#arpan#_", -1));
    }
}
