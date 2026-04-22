//leetcode 42. Trapping Rain Water. link: https://leetcode.com/problems/trapping-rain-water/
public class trappingrainwater {
    public static void main(String[] args) {

        int height[] = {4,2,0,3,2,5};
        int water = 0;

        for(int i=1;i<height.length-1;i++){

            int leftMax = height[i];
            for(int j=0;j<i;j++){
                leftMax = Math.max(leftMax,height[j]);
            }

            int rightMax = height[i];
            for(int j=i+1;j<height.length;j++){
                rightMax = Math.max(rightMax,height[j]);
            }

            water += Math.min(leftMax,rightMax) - height[i];
        }

        System.out.println("Total Water: " + water);
    }
}