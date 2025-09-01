import java.util.Scanner;
class Leetcode {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[100];
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.printf("\nEnter item %d: ", i+1);
            nums[i] = sc.nextInt();
        }
        System.out.print("\nEnter the target element: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        if(result[0] == -1)
            System.out.println("No two elements add up to the target.");
        
        else
            System.out.println("\n["+result[0]+","+result[1]+"]");

    }
}


