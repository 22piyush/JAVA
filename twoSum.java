public class twoSum {

    public static void main(String[] args) {

        int nums[]={6,7,5,2};
        int target=9;

        for(int i=0; i<nums.length-1;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    System.out.println("["+i+","+j+"]");
                }
                if(nums[i] + nums[j] == target)
                {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
}
