package ua.markevych.practice5;
//Известен рост каждого из 25 учеников класса.
// Рост мальчиков условно задан отрицательными числами.
// Определить средний рост мальчиков и средний рост девочек.

public class Task6 {
    public static void main(String[] args) {
        int[] heights = {150, -170, 125, 145, -147, -167, 189, -171, 166, -165};
        System.out.println(averageForBoys (heights));
        System.out.println(averageForGirls (heights));
    }
public static double averageForBoys (int[] heights){
        double heightsBoys = 0;
        int countBoys = 0;
    for (int i = 0; i < heights.length; i++) {
        if (heights[i]<0){
            heightsBoys += heights[i];
            countBoys += 1;
        }

    }
    return Math.abs(heightsBoys/countBoys);
}
    public static double averageForGirls (int[] heights){
        double heightsGirls = 0;
        int countGirls = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i]>0){
                heightsGirls += heights[i];
                countGirls += 1;
            }

        }
        return heightsGirls/countGirls;
    }
}
