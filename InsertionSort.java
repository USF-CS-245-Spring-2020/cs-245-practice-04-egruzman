/**
* Insertion Sort
* @author Eli Gruzman
* 
*/

public class InsertionSort implements SortingAlgorithm
{
    public void sort(int [] arr)
    {
        int a = arr.length;

        for (int i = 1; i < a; i++)
        { 
            int index = arr[i]; 
            int j = i-1; 

            while (j >= 0 && arr[j] > index)
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = index; 
        } 
    }
}