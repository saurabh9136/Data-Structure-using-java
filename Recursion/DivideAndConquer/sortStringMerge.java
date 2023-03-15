package Recursion.DivideAndConquer;
public class sortStringMerge {

    public static String[] sortString(String[] str, int si, int ei){

        if(si == ei ){

            String[]A= {str[si]};
            return A;
        }

        // cal the mid
        int mid = si + (ei-si)/2;

        // sort left part
        String arr1[] = sortString(str, si, mid);
        // sort right part
        String arr2[] =sortString(str, mid+1, ei);

        String arr3[] = mergeSort(arr1,arr2);
        return arr3;
    }

    public static String[] mergeSort(String arr1[], String arr2[]){

        int left = arr1.length;
        int right = arr2.length;
        String arr3[] = new String[left+right]; // temporary variable

        int idx = 0;
        int i=0; 
        int j = 0;
// check with conditions
    
    while(left < 1 &&  right < j){

        if(isAlphabeticallySmaller(arr1[i],arr2[j])){

            arr3[idx] = arr1[i];
            i++;
        }
        else{
            arr3[idx] = arr2[j];
            j++;
        }
        idx++;

    }

    // again check if certain condition
    while( i < left){
        arr3[idx++] = arr1[i++];        

    }

    // check for other cond
    while( j < right){
        arr3[idx++] = arr1[j++]; 
    }
        return arr3;

    }

    private static boolean isAlphabeticallySmaller(String string, String string2) {

        if(string.compareTo(string2) < 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

      String str[] = { "sun", "earth", "mars", "mercury" };
      String[] a =  sortString(str, 0, str.length-1);
      for(int i=0; i<a.length; i++){

        System.out.println(a[i]);
      }

      int n = 50;
      int  k =5;
      for(int i=0; i<n; i=i+k){

        for(int j=0; j<=k; j++){

            System.out.print(i+","+j);
        }
      }
      System.out.println();
        
    }
    
}
