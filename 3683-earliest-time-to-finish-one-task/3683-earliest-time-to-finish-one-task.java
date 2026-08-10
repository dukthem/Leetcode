class Solution {
    public int earliestTime(int[][] task) {
        int small_time = 0;
        for (int i = 0; i < task.length; i++){
            if (i == 0){
                small_time = (task[0][0] + task[0][1]);
            } else{
                int time_iteration = (task[i][0] + task[i][1]);
                if (time_iteration < small_time) {
                    small_time = time_iteration;
                } else{
                    continue;
                }
            }
        }
        return small_time;
    }
}