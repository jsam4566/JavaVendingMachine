public class Calories {
    public int[][][] calories;

    public Calories(int rows, int cols, int depth) {
        calories = new int[rows][cols][depth];
    }
    public void addCalories(int row, int col, int depth, int calorieTotal) {
        if (row >= 0 && row < calories.length && col >= 0 && col < calories[0].length && depth >= 0 && depth < calories[1].length) {
            calories[row][col][depth] = calorieTotal;
        } else {
            //System.out.println("Invalid location for adding calorie.");
        }

    }
    public int getCalories(int row, int col, int depth){
        if (row >= 0 && row < calories.length && col >= 0 && col < calories[0].length && depth >= 0 && depth < calories[1].length) {
            int calorieTotal = calories[row][col][depth];
            if (calories != null) {
                calories[row][col][depth] = 0;
                return calorieTotal;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    public void display() {
        for (int i = 0; i < calories.length; i++) {
            for (int g = 0; g < calories[0].length; g++) {
                for (int k = 1; k < calories[1].length; k++) {
                    int calorie = calories[i][g][k];
                }{
                    System.out.print("[Empty] ");
                    System.out.print("[" + calories + "]");
                }
            }
            System.out.println();
        }
    }
}




