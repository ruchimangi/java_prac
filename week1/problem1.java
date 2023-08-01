package week1;

public class problem1 {
    public static void main(String[] args)
    {
        int[] arr = new int[] {1,2,3,4,5,6,7,8};

        int sum[];

        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("sum of array is:"+sum);
        
    }
    
}
