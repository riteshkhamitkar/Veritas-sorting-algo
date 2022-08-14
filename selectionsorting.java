class Main{
    
    public void selection(int arr[]){
        for(int j = 0; j<arr.length;j++){
            int min = j;
            for(int i = j+1; i < arr.length;i++){
                if(arr[i] < arr[min]){
                    min = i;
                }
            }
            if(min !=j){
                int temp = arr[j];
                arr[j]=arr[min];
                arr[min]= temp;
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
        ritesh.selection(arr);
        ritesh.printArray(arr);
    }
}
