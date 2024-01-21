//Trapping Rainwater-- Medium Level(VERY  IMPORTANT)

/*Q. Given n non-negative integers representing an elevation map where the width of each
bar is 1. Compute how much water it can trap after raining */

//height={4,2,0,6,3,2,5}

public class Eleventh{
    public static int TrappedWater(int height[]){
        //Calculate left max boundary --> Array Form-1
        //Calculate right max boundary -->Array Form-2

        //loop  --> 3
        //waterLevel=min(left max,right max boundary)  -->4
        //trapped water=water level-height[i]  -->5

        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];

        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[]=new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        //loop

        int trappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrappedWater(height));
    }
}
