import java.util.*;
class Main {
  public static int partition(int arr[],int start,int end){
    int pivot=arr[end];
    int i=start-1;
    for(int j=start;j<end;j++){
      if(arr[j]<pivot){
          i++;
          int t=arr[i];
          arr[i]=arr[j];
          arr[j]=t;
      }
    }
      int t=arr[i+1];
      arr[i+1]=arr[end];
      arr[end]=t;
      return (i+1); 
  }
  public static void quickSort(int arr[],int start,int end){
    if(start<end){
     int p=partition(arr,start,end);
      quickSort(arr,start,p-1);
      quickSort(arr,p+1,end);
    }
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    quickSort(arr,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
