class Main{
    
     void bubble(int arr[]){
         int n = arr.length;
         for(int i =0; i < n;i++){
             for(int j =0;j<n-i-1;j++){
                 if(arr[j]>arr[j+1]){
                     int temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1]= temp;
                 }
             }
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
        ritesh.bubble(arr);
        ritesh.printArray(arr);
    }
}
