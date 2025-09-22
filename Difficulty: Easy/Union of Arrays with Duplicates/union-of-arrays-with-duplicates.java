import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < a.length; i++) set.add(a[i]);
        for(int j = 0; j < b.length; j++) set.add(b[j]);
        ArrayList<Integer> unionList = new ArrayList<>(set);
        Collections.sort(unionList);
        return unionList;
    }
}
