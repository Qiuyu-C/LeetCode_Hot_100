import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * LeetCode 406.根据身高重建队列
 * Queue Reconstruction by Height
 */

public class Solution_406 {
    public int[][] reconstructQueue(int[][] people) {
        int length = people.length;

        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] != o2[0]) {
                    return o2[0] - o1[0];
                }
                else {
                    return o1[1] - o2[1];
                }
            }
        });

        List<int[]> height = new ArrayList<>();

        for (int[] person : people) {
            height.add(person[1], person);
        }

        int[][] output = height.toArray(new int[length][]);

        return output;
    }
}
