//In this chapter, i am going to start my DSA journey using java and solve some popular array problems.
import java.util.Scanner;

class D1_Arrays{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        //Array decleration, input/output
        int[] arr = new int[5];
        for(int i=0; i<5; i++){
            System.out.printf("Enter element %d: ", i+1);
            arr[i] = sc.nextInt();
        }
        
        //Traversing using for each loop
        for(int a : arr){
            System.out.println(a);
        }
        
        //Q1: Find sum of elements in an array
        int[] x = {25,13,30,37,28};
        int sum = 0;
        for(int a : x){
            sum = sum + a;
        }
        System.out.println("Sum = " + sum);

        //Q2: Find maximum and minimum value
        int max = x[0];
        int min = x[0];
        for(int i=1; i<x.length; i++){
            if(x[i]>max){
                max = x[i];
            }
            if(x[i]<min){
                min = x[i];
            }
        }
        System.out.println("Maximum value = " + max + ", Minimum value = " + min);

        //Q3: Reverse an array
        for(int i=0; i<x.length/2; i++){
            int temp = x[i];
            x[i] = x[x.length-1-i];
            x[x.length-1-i] = temp;
        }
        System.out.println("Reversed array = " + Arrays.toString(x));

        //Q4: Reverse an array using while loop
        int[] z = {25,13,30,37,28};
        int i = 0, j = z.length-1;
        int temp;
        while(i<j){
            temp = z[i];
            z[i] = z[j];
            z[j] = temp;
            i++; j--;
        }
        for(int a : z){
            System.out.print(a + " ");
        }

        //Q5: Linear search an element
        // System.out.println("Enter the value to search: ");
        // int value = sc.nextInt();
        // boolean isfound = false;
        // for(int i=0; i<x.length; i++){
        //     if(x[i] == value){
        //         System.out.println(value + " Found at " + i + " index.");
        //         isfound = true;
        //         break;
        //     }
        // }
        // if(!isfound){
        //     System.out.println(value + " is not present in the array.");
        // }
    }
}