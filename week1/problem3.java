package week1;

public class problem3 {
    public static void main(String[] args){

            int[] arr1 = {12,24,67};
    
            
            int[] arr2 = new int[arr1.length];
    
            
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
    
            
            System.out.print("arr2 is: ");
            for (int num : arr2) {
                System.out.print(num + " ");
            }
        }

    }
    
