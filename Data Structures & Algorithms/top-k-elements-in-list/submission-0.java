class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int N = nums.length;

        // Calculate freq
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int freq = freqMap.getOrDefault(nums[i], 0);
            freqMap.put(nums[i], freq + 1);
        }

        // Bucket Sort
        List<Integer>[] buckets = new List[N+1];
        freqMap.forEach((key, v) -> {
            if (buckets[v] == null) {
                buckets[v] = new ArrayList<>();
            }
            buckets[v].add(key);
        });

        int[] res = new int[k];
        int index = 0;
        for (int i = N; i > 0 && index < k; i--) {
            if (buckets[i] == null) continue;
            
            for (int n : buckets[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}
