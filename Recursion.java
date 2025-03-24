public class Recursion {
    // Recursion is a method in which a function calls itself
    //types of recursion
    //Direct:A function calls itself;
    //Indirect: A function calls another function which in turn call

    public static int binarysearch(int[] arr,int target,int left,int right)
    {
        if(left>right)
        {
            return -1;
        }
        int mid = left+(right-left)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]>target)
        {
            return binarysearch(arr, target, left, mid-1);
        }
        else
        {
            return binarysearch(arr, target, mid+1, right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8,9};
        int target = 6;
        System.out.println(binarysearch(arr, target, 0, arr.length-1));
    }
}
