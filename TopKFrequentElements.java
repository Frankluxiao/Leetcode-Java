//347. Top K Frequent Elements
/*
 Given a non-empty array of integers, return the k most frequent elements.
 
 For example,
 Given [1,1,1,2,2,3] and k = 2, return [1,2].
 
 Note:
 You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 Your algorithm's time complexity must be better than O(n log n), where n is the array's size.*/
import java.util.*;


// Method: 1
/*
class TopKFrequentElements {
    public static Comparator<HashMap.Entry<Integer, Integer>> hashMapComp = new Comparator<HashMap.Entry<Integer, Integer>>(){
        @Override
        public int compare(HashMap.Entry<Integer, Integer> a, HashMap.Entry<Integer, Integer> b) {
            return b.getValue() - a.getValue();
        }
    };

    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        PriorityQueue<HashMap.Entry<Integer, Integer>> sortMap = new PriorityQueue<>(1, hashMapComp);
        for(HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            sortMap.add(entry);
        }
        List<Integer> result = new ArrayList<Integer>();
        while(result.size() < k) {
            result.add(sortMap.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,2,1,1,2,3};
        int k = 2;
        List<Integer> output = topKFrequent(input, k);
        System.out.println(output);
    }
}
*/

// Method 2
/*
class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        //PriorityQueue<HashMap.Entry<Integer, Integer>> sortMap = new PriorityQueue<HashMap.Entry<Integer, Integer>>(1, (a,b) -> b.getValue() - a.getValue());
        PriorityQueue<HashMap.Entry<Integer, Integer>> sortMap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        for(HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            sortMap.add(entry);
        }
        List<Integer> result = new ArrayList<Integer>();
        while(result.size() < k) {
            result.add(sortMap.poll().getKey());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] input = {1,2,1,1,2,3};
        int k = 2;
        List<Integer> output = topKFrequent(input, k);
        System.out.println(output);
    }
}
*/

// Method: 3
import java.util.Comparator;
class HashMapComparator implements Comparator<HashMap.Entry<Integer, Integer>> {
    @Override
    public int compare(HashMap.Entry<Integer, Integer> a, HashMap.Entry<Integer, Integer> b) {
        if(a.getValue() < b.getValue()) return 1;
        else if(a.getValue() > b.getValue()) return -1;
        else return 0;
    }
}

class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num, 0)+1);
        }
        Comparator<HashMap.Entry<Integer, Integer>> hashMapComp = new HashMapComparator();
        PriorityQueue<HashMap.Entry<Integer, Integer>> sortMap = new PriorityQueue<>(1, hashMapComp);
        for(HashMap.Entry<Integer, Integer> entry : count.entrySet()) {
            sortMap.add(entry);
        }
        List<Integer> result = new ArrayList<Integer>();
        while(result.size() < k) {
            result.add(sortMap.poll().getKey());
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = {1,2,1,1,2,3};
        int k = 2;
        List<Integer> output = topKFrequent(input, k);
        System.out.println(output);
    }
}
