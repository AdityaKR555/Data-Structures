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

    //2

    public static int reverse(int x) {
        int rev = 0;
        // int n = String.valueOf(x).length();
        // for(int i=0; i<n; i++){
        //     rev = (rev*10) + (x%10);
        //     x = x/10;
        // }
        boolean isnegative = false;
        if(x<0){
            x = -x;
            isnegative = true;
        }
        while(x>0){
            rev = (rev*10) + (x%10);
            x = x/10;
        }
        if(isnegative){
            rev = -rev;
            return rev;
        }
        return rev;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int[] nums = new int[100];
        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();
        // for(int i=0; i<size; i++){
        //     System.out.printf("\nEnter item %d: ", i+1);
        //     nums[i] = sc.nextInt();
        // }
        // System.out.print("\nEnter the target element: ");
        // int target = sc.nextInt();

        // int[] result = twoSum(nums, target);

        // if(result[0] == -1)
        //     System.out.println("No two elements add up to the target.");
        
        // else
        //     System.out.println("\n["+result[0]+","+result[1]+"]");
        int rev = reverse(120);
        System.out.println(rev);


        //Best time to buy and sell a stock
//         class Solution {
//             public int maxProfit(int[] prices) {
//         int minPrice = prices[0];   // lowest price so far
//         int maxProfit = 0;          // best profit so far

//         for(int i = 1; i < prices.length; i++) {
//             // check profit if we sell today
//             int profit = prices[i] - minPrice;
//             if(profit > maxProfit) {
//                 maxProfit = profit;
//             }

//             // update minPrice if we find a lower price
//             if(prices[i] < minPrice) {
//                 minPrice = prices[i];
//             }
//         }

//         return maxProfit;
//     }
// }

    }
}


