import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public ArrayList<String> generateBinary(int n) {
        ArrayList<String> result = new ArrayList<>();
        if (n <= 0) return result;

        Queue<String> q = new LinkedList<>();
        q.add("1");

        for (int i = 0; i < n; i++) {
            String current = q.poll();
            result.add(current);

            // append "0" and "1" to generate next binary numbers
            q.add(current + "0");
            q.add(current + "1");
        }

        return result;
    }
}
