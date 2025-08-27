import java.util.*;
import java.util.stream.*; 
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> list=new HashSet<>();
        list=Stream.concat(Arrays.stream(a).boxed(),Arrays.stream(b).boxed())
                    .collect(Collectors.toSet());
                    
        return new ArrayList<>(list);
    }
}