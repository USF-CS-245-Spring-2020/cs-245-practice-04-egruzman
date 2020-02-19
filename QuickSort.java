/**
* Quick Sort
* @author Eli Gruzman
* 
*/

public class QuickSort implements SortingAlgorithm
{
    public void sort(int [] arr)
    {
        sort(arr, 0, arr.length);
    }

    public void sort(int [] arr, int left, int right) 
    { 
        int split = partition(arr, left, right);

        if (left < split-1)
        {
            sort(arr, left, split+1);
        }
        if (right > split)
        {
            sort(arr, split, right);
        }
    }

    public int partition(int arr[], int left, int right) 
    { 
        int pivot = arr[left];  
        int i = left+1;
        int temp = 0;

        for (int j = left+1; j < right; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
                i++;
            } 
        } 
        temp = arr[left]; 
        arr[left] = arr[i-1]; 
        arr[i-1] = pivot; 
  
        return i; 
    }
}