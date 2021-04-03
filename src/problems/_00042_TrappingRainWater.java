package problems;

public class _00042_TrappingRainWater {

    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }

        int indexOfMax = indexOfMax(height);

        int trapedWater = 0;
        int max = 0;
        for (int i = 0; i < indexOfMax; i++) {
            if (height[i] > max) {
                max = height[i];
            } else {
                trapedWater += max - height[i];
            }
        }

        max = 0;
        for (int i = height.length - 1; i > indexOfMax; i--) {
            if (height[i] > max) {
                max = height[i];
            } else {
                trapedWater += max - height[i];
            }
        }
        return trapedWater;

    }

    private int indexOfMax(int[] nums) {

        int max = 0;
        int indexOfMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                max = nums[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
