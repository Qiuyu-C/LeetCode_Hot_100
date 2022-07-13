import java.util.HashMap;

/**
 * LeetCode 621.任务调度器
 * Task Scheduler
 */
public class Solution_621 {
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> quest = new HashMap<>();
        int length = tasks.length;
        int maxCount = 0;
        int maxQuest = 0;

        for (int i = 0; i < length; i++) {
            int num = quest.getOrDefault(tasks[i], 0);
            quest.put(tasks[i], num+1);
            maxCount = Math.max(maxCount, num+1);
        }

        for (int value : quest.values()) {
            if (value == maxCount) {
                maxQuest += 1;
            }
        }

        int time = Math.max(length, (n+1)*(maxCount-1) + maxQuest);

        return time;
    }
}
