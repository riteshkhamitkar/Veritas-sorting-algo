class Main{
    
     static void insertionsort(int arr[]){
         for(int i = 1; i < arr.length;i++){
             int temp = arr[i], j=i;
             while(j>0 && arr[j-1]>temp){
                 arr[j]= arr[j-1];
                 j--;
             }
             arr[j]= temp;
         }
     }
    
    public static void printArray(int arr[]){
        for(int i =0; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args){
        Main ritesh = new Main();
        int arr[] = {3,5,6,2,5,2,1};
        ritesh.insertionsort(arr);
        ritesh.printArray(arr);
    }
}
