//Bubble Sort 

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
  
  .......................................
 //Selection sort
    
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
      
    .......................................
      //Insertion sort
      
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
    .........................................
    //Searching algorithms
    ........................................
     public class Main{
    
    public static int linearsearch(int arr[],int value){
        for(int i = 0; i < arr.length; i++){
            if(arr[i]==value){
                System.out.println("Found "+i);
                return -1;
            }
        }
        System.out.println("Not found "+ value);
        return -1;
    }
    
    //binary search
    
    public static int binarysearch(int arr[], int value){
        int start = 0;
        int end = arr.length -1;
        int middle = (start+end/2);
        while(arr[middle] != value && start <= end){
            if(value < arr[middle]){
                end = middle -1;
            }else{
                start = middle +1;
            }
            middle = (start+end)/2;
        }
        if(arr[middle] == value){
            System.out.println("Found "+middle);
            return middle;
        }else{
            System.out.println("Not found "+value);
            return -1;
        }
    }
    
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,7,8};
        Main ritesh = new Main();
        ritesh.linearsearch(arr,8);
        ritesh.binarysearch(arr,4);
    }
}
     ........................................................
