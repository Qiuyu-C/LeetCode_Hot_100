import java.util.Arrays;

/**
 * LeetCode 253.会议室II
 * Meeting Rooms II
 */
public class Solution_253 {
    public int minMeetingRooms(int[][] intervals) {
        int length = intervals.length;
        int[] start = new int[length];
        int[] end = new int[length];
        int rooms = 0;

        for (int i = 0; i < length; i++) {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }

        Arrays.sort(start);
        Arrays.sort(end);

        int startPtr = 0;
        int endPtr = 0;

        while (startPtr < length) {
            if (start[startPtr] >= end[endPtr]) {
                rooms -= 1;
                endPtr += 1;
            }

            rooms += 1;
            startPtr += 1;
        }

        return rooms;
    }
}
