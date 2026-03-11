class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums) map.put(i , map.getOrDefault(i,0)+1);
        for(int i : nums){
            if(map.get(i) == 1){
                if(!map.containsKey(i-1) && !map.containsKey(i+1)) list.add(i);
            }
        }
        return list;
    }
}