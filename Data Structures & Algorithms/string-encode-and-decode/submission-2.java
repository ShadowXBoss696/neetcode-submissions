class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "<<empty>>";
        return String.join("_#arpan#_", strs);
    }

    public List<String> decode(String str) {
        if (str.equals("<<empty>>")) return List.of();
        return Arrays.asList(str.split("_#arpan#_", -1));
    }
}
