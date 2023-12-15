package Meeting_13_12_23.AdvancedExercises;

public class NumsAndTarget {

    public static void main(String[] args) {

        int[] nums = {5, 10, 15};

        int target = 25;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (i != j && nums[i] + nums[j] == target) {

                    System.out.println("The values for the indexes " + i + " and " + j +
                            " of the nums array add up to the target value");
                    break;
                }
            }
        }
    }
}
