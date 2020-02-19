/**
* Merge Sort
* @author Eli Gruzman
* 
*/

public class MergeSort implements SortingAlgorithm
{
    public void sort(int [] arr)
    {
        sort(arr, 0, arr.length-1);
    }

    public void sort(int [] arr, int left, int right) 
    { 
        if (left < right) 
        { 
            int middle = (left+right)/2;

            //Sort 1st half
            sort(arr, left, middle);
            //Sort 2nd half
            sort(arr , middle+1, right); 
            //Merge sorted halves
            merge(arr, left, middle, right); 
        } 
    }

    public void merge(int [] arr, int left, int middle, int right) 
    { 
        //Size left array
        int arr1Size = middle - left + 1; 
        //Size right array
        int arr2Size = right - middle;

        //Temporary arrays for storing
        int leftTemp[] = new int [arr1Size]; 
        int rightTemp[] = new int [arr2Size]; 

        for (int i = 0; i < arr1Size; i++)  
            leftTemp[i] = arr[left+1];

        for (int j = 0; j < arr2Size; j++) 
            rightTemp[j] = arr[middle+j+1]; 
        
        int i = 0;
        int j = 0;
        int k = left;

        while (i < arr1Size && j < arr2Size) 
        { 
            if (leftTemp[i] <= rightTemp[j]) 
            { 
                arr[k] = leftTemp[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = rightTemp[j]; 
                j++; 
            } 
            k++; 
        } 
  
        //Copy remaining left subarray elements
        while (i < arr1Size) 
        { 
            arr[k] = leftTemp[i]; 
            i++; 
            k++; 
        } 
  
        //Copy remaining right subarray elements
        while (j < arr2Size) 
        { 
            arr[k] = rightTemp[j]; 
            j++; 
            k++; 
        } 
    } 
}