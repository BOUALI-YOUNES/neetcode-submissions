class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> counts = new HashMap<>();
        for(int num : nums) {
            counts.put(num , counts.getOrDefault(num , 0) + 1);
        }
        List<Map.Entry<Integer , Integer >> entry = new ArrayList<>(counts.entrySet());
        entry.sort(Map.Entry.<Integer ,Integer>comparingByValue().reversed());
        int[] result = new int[k];
        for(int i = 0 ; i < k ; i++) {
            result[i] = entry.get(i).getKey();
        }
        return result;
    }
}
