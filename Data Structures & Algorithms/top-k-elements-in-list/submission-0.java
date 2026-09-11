class Solution { 
    public int[] topKFrequent(int[] nums, int k) { 
        int n = nums.length; 
        boolean[] visited = new boolean[n]; 
        List<List<Integer>> ans = new ArrayList<>(); 

        for(int i = 0; i < nums.length; i++){ 
            List<Integer> list = new ArrayList<>(); 

            if(visited[i]){ 
                continue; 
            } 

            visited[i] = true; 
            list.add(nums[i]); 
            int count = 1; 

            for(int j = i + 1; j < nums.length; j++){ 
                if(visited[j]){ 
                    continue; 
                } 

                if(nums[i] == nums[j]){ 
                    count++; 
                    visited[j] = true; 
                } 
            } 

            list.add(count); 
            ans.add(list); 
        } 

        Collections.sort(ans, (a, b) -> b.get(1) - a.get(1)); 

        int[] arr = new int[k]; 

        for(int i = 0; i < k; i++){ 
            arr[i] = ans.get(i).get(0); 
        } 

        return arr; 
    } 
}