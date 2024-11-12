public class Remove_Duplicates_from_Sorted_Array{
    public static void main(String[] args) {
        int arr[]={1,1,2};
        int n=arr.length;
        int unique=1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                arr[unique++]=arr[i];
            }
        }
        System.out.println(unique);
    }
}
