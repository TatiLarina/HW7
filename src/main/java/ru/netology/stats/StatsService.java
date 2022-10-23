package ru.netology.stats;

public class StatsService {

    public int getSum(int[] stats) {
        int sum = 0;
        for (int s : stats) {
            sum += s;
        }
        return sum;
    }

    public int getAverage(int[] stats) {
        int sum = getSum(stats);
        return sum / stats.length;
    }

    public int getMaxMonth(int[] stats) {
        int maxMonth = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] >= stats[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int getMinMonth(int[] stats) {
        int minMonth = 0;
        for (int i = 0; i < stats.length; i++) {
            if (stats[i] <= stats[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getLessAverage(int[] stats) {
        int count = 0;
        int average = getAverage(stats);
        for (int s : stats) {
            if (s < average) {
                count += 1;
            }
        }
        return count;
    }

    public int getMoreAverage(int[] stats) {
        int count = 0;
        int average = getAverage(stats);
        for (int s : stats) {
            if (s > average) {
                count += 1;
            }
        }
        return count;
    }

}
