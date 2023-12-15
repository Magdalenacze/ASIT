package Meeting_11_12_23.AdvancedExercises;

public class Result {

    private int maxValue;
    private int maxValueIndex;

    public Result(int maxValue, int maxIndex) {
        this.maxValue = maxValue;
        this.maxValueIndex = maxIndex;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public int getMaxIndex() {
        return maxValueIndex;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    public void setMaxValueIndex(int maxValueIndex) {
        this.maxValueIndex = maxValueIndex;
    }
}
