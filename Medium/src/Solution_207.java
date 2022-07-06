import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode 207.课程表
 * Course Schedule
 */
public class Solution_207 {
    List<List<Integer>> edge;
    int[] visited;
    boolean valid = true;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        edge = new ArrayList<List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            edge.add(new ArrayList<Integer>());
        }

        visited = new int[numCourses];

        for (int[] pre : prerequisites) {
            edge.get(pre[1]).add(pre[0]);
        }

        for (int i = 0; i < numCourses&& valid; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }

        return valid;
    }

    public void dfs(int k) {
        visited[k] = 1;
        for (int v : edge.get(k)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            }
            else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[k] = 2;
    }
}
