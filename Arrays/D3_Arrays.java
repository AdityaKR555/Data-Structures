public class D3_Arrays {

    //1: Find the total no. of pairs in array whose sum is equal to given target k
    public static int targetPairSum(int[] arr, int k){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }

    //2: Count the no. of triplets whose sum is equal to target
    public static int tripletSum(int[] arr, int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1; k<arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target) count++;
                }
            }
        }
        return count;
    }

    //3: Find the unique element of an array which does not repeat twice
    public static int uniqueElement(int[] arr){
        
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            for(int j = 0; j<arr.length; j++){  //as to check all appearance of an element
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1) return arr[i];
        }
        return -1;
    }


    //4: Return the first value that is repeating. If no value repeats itself, return -1
    public static int firstRepetiton(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //1
        int[] arr =  {1,2,6,4,5,3,9,0};
        System.out.println(targetPairSum(arr, 7));
        //2
        System.out.println(targetPairSum(arr, 12));
        //3
        int[] brr = {1,2,3,2,4,1,3};
        System.out.println(uniqueElement(brr));
        //4
        System.out.println(firstRepetiton(brr));
    }
}
