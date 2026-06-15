public class SumOfDigits{
    public static void main(String[] args){
        int[] arr={4,5,6,7,8,9};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
            // sum = sum + arr[i];
        }
        System.out.println("Sum of digits: " + sum);
    }

}