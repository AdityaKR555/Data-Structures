

public class D2_ArraysComplex {
public static void main(String[] args) {

// Q1: Insertion at beginning
// int[] arr = new int[5];
// arr[0] = 1;
// arr[1] = 2;
// arr[2] = 3;
// arr[3] = 4;
// int size = 4;
// int value = 7;

// for(int i=size-1; i>=0; i--){            //method-1
//     arr[i+1] = arr[i];
// }

// for(int i=0; i<size; i++){                  //method-2
//     arr[size-i] = arr[size-i-1];
// }
// arr[0] = value;
// for(int a : arr){
//     System.out.println(a);
// }

//Q2: Insertion at given index
// int[] arr = new int[5];
// arr[0] = 1;
// arr[1] = 2;
// arr[2] = 3;
// arr[3] = 4;
// int size = 4;
// int value = 7;
// int index = 2;
// for(int i=size-1; i>=index; i--){
//     arr[i+1] = arr[i];
// }
// arr[index] = value;
// for(int a : arr){
//     System.out.println(a);
// }

//Q3: Deletion from given index
// int[] arr = new int[5];
// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;
// arr[3] = 40;
// int size = 4;
// int indexToDelete = 2;
// for(int i=indexToDelete; i<size-1; i++){
//     arr[i] = arr[i+1];
// }
// size--;
// for(int i=0; i<size; i++){
//     System.out.println(arr[i]);
// }

//Q4: Deletion by value
// int[] arr = new int[4];
// arr[0] = 10;
// arr[1] = 20;
// arr[2] = 30;
// arr[3] = 40;
// int size = 4;
// int valueToDelete = 30;
// for(int i=0; i<size; i++){
//     if(arr[i] == valueToDelete){
//         for(int j=i; j<size-1; j++){
//             arr[j] = arr[j+1];
//         }
//         size--;
//         break;
//     }
// }

// for(int i=0; i<size; i++){
//     System.out.println(arr[i]);
// }


//Q5: Move all zeros to the end of the array
// int[] arr = {0, 1, 0, 3, 12};
// int j = 0;

// // Step 1: Move non-zero elements forward
// for(int i = 0; i < arr.length; i++){
//     if(arr[i] != 0){
//         arr[j] = arr[i];
//         j++;
//     }
// }

// // Step 2: Fill remaining with zeros
// for(int i = j; i < arr.length; i++){
//     arr[i] = 0;
// }

// // Output
// for(int a : arr){
//     System.out.print(a + " ");
// }

// //Q6: Left rotate array by one position
// int[] arr = {1,2,3,4,5};
// int temp = arr[0];
// for(int i=0; i<arr.length-1; i++){
//     arr[i] = arr[i+1];
// }
// arr[arr.length-1] = temp;

// for(int a : arr){
//     System.out.println(a);
// }

//Q7: Right rotate array by one position
// int[] arr = {1,2,3,4,5};
// int temp = arr[arr.length-1];
// for(int i=arr.length-1; i>0; i--){
//     arr[i] = arr[i-1];
// }
// arr[0] = temp;

// for(int a : arr){
//     System.out.println(a);
// }

//Q8: Find Second Largest element
// int[] arr = {43,32,11,42,21};
// int max = Integer.MIN_VALUE;
// int secondMax = Integer.MIN_VALUE;
// for(int i=0; i<arr.length; i++){
//     if(arr[i] > max) max = arr[i];
// }
// for(int i=0; i<arr.length; i++){
//     if(arr[i] > secondMax && arr[i] < max) secondMax = arr[i];
// }

// System.out.println(max);
// System.out.println(secondMax);

//Q9: Only check if array is sorted
// int[] arr = {43,32,11,42,21};
// // int[] arr = {12,12,13,15,17};

// boolean isSorted = true;
// for(int i=0; i<arr.length-1; i++){
//     if(arr[i] > arr[i+1]){
//         isSorted = false;
//         break;
//     }
// }
// if(isSorted) System.out.println("Sorted");
// else System.out.println("Not sorted");

//Q10: Count frequency of each element in the array
// int[] arr = {12,12,13,15,17,17,17,15};
// boolean[] visited = new boolean[arr.length];
// int count = 0;

// for(int i=0; i<arr.length; i++){

//     if(!visited[i]){
//         for(int j=i; j<arr.length; j++){
//             if(arr[j] == arr[i]){
//             count+=1;
//             visited[j] = true;
//             } 
//         }
//     System.out.printf("%d occurs %d times\n",arr[i],count);
//     count = 0;
//     }
   
// }

//Q11: Find duplicate elements

// int[] arr = {12, 13, 15, 12, 17, 15, 17, 17};
// boolean[] visited = new boolean[arr.length];

// System.out.println("Duplicate elements with their counts:");
// for (int i = 0; i < arr.length; i++) {
//     if (!visited[i]) {
//         int count = 1;
//         for (int j = i + 1; j < arr.length; j++) {
//             if (arr[i] == arr[j]) {
//                 count++;
//                 visited[j] = true;
//             }
//         }
//         if (count > 1) {
//             System.out.printf("%d occurs %d times\n", arr[i], count);
//         }
//     }
// }

//Q12: Remove Duplicate elements
//  int[] arr = {12, 13, 15, 12, 17, 15, 17, 17};
//         int size = arr.length;

//         for (int i = 0; i < size; i++) {
//             for (int j = i + 1; j < size; j++) {
//                 if (arr[i] == arr[j]) {
//                     // Shift all elements left
//                     for (int k = j; k < size - 1; k++) {
//                         arr[k] = arr[k + 1];
//                     }
//                     size--;
//                     j--; // recheck the current position
//                 }
//             }
//         }

//         for (int i = 0; i < size; i++) {
//             System.out.print(arr[i] + " ");
//         }

//Q13: Merge two sorted arrays
// int[] a = {1, 3, 4, 7};
// int[] b = {2, 5, 6, 8};
// int[] merged = new int[a.length + b.length];

// int i = 0, j = 0, k = 0;

// while (i < a.length && j < b.length) {
//     if (a[i] < b[j]) {
//         merged[k++] = a[i++];
//     } else {
//         merged[k++] = b[j++];
//     }
// }

// // remaining elements
// while (i < a.length) {
//     merged[k++] = a[i++];
// }
// while (j < b.length) {
//     merged[k++] = b[j++];
// }

// for (int x : merged) {
//     System.out.print(x + " ");
// }

//Q14: Kayden's algorithm
// int[] arr = {1, -2, 3, 4, -1, 2, 1, -5};
// int currentSum = 0;
// int maxSum = Integer.MIN_VALUE;

// for(int i=0; i<arr.length; i++){
//     currentSum += arr[i];
//     if(currentSum > maxSum) maxSum = currentSum;
//     if(currentSum < 0) currentSum = 0;
        
// }
// System.out.println("Maximum sum = " + maxSum);



}
}
