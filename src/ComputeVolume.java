public class ComputeVolume {


        public static int maxArea(int[] height) {
            int maxarea = 0;
            for (int i = 0; i < height.length; i++)
                for (int j = i + 1; j < height.length; j++)
                    maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j - i));
            return maxarea;
        }

        public static void main(String[] args)
        {

            int[] height ={1,3,7};

            System.out.println("Area is :::"+maxArea(height));

        }
}
