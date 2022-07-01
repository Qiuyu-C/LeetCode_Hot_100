import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 56.合并区间
 * Merge Interval
 */
public class Solution_56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (v1, v2)-> v1[0]-v2[0]); //排序
        int n = intervals.length;
        List<int[]> mergedInterval = new ArrayList<>();

        if (n == 1) {
            return intervals;
        }

        mergedInterval.add(intervals[0]);

        for (int i =1; i < n; i++) {
            int listSize = mergedInterval.size();
            // System.out.println(listSize)
            int[] prev = mergedInterval.get(listSize-1);

            if (prev[1] >= intervals[i][0]) {
                int newStart = Math.min(prev[0], intervals[i][0]);
                int newEnd = Math.max(prev[1], intervals[i][1]);
                mergedInterval.remove(listSize-1);
                int[] newRange = new int[2];
                newRange[0] = newStart;
                newRange[1] = newEnd;
                mergedInterval.add(newRange);

            }
            else {
                mergedInterval.add(intervals[i]);
            }
        }

        return mergedInterval.toArray(new int[mergedInterval.size()][]);
    }
}
