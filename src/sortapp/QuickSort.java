/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sortapp;


/**
 *
 * @author ryan
 */
public class QuickSort{ 
    
    

    public QuickSort()
    {
        
    }

 
    /**
     * 
     * @param array
     * @param start
     * @param end
     * @return 
     */
    int[] quickSort(int [] array, int start , int end)
    {
        int idx = partition(array, start, end);
        
        // recursively call quicksort on left part of partitioned array
        if( start < idx - 1)
        {
            quickSort(array, start, idx -1);
        }
        
        // recursively call quicksort on left part of partitioned array
        if( end > idx)
        {
            quickSort(array, idx, end);
        }
        
        
        return array;
    }
    
    /**
     * divide the array from pivot, left side less than pivot,
     * right side greater than pivot
     * @param array 
     * @param left
     * @param right
     * @return the partition index
     */
    int partition(int[] array, int left, int right)
    {
        int pivot = array[left]; // first element as pivot
        
        while(left <= right)
        {
            while(array[left] < pivot)
            {
                left++;
            }
            
            while(array[right] > pivot)
            {
                right--;
            }
            
            //swap values
            if(left <= right)
            {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                
                // increment left and decrement right index
                left++;
                right--;
            }
        }
        
        return left;
    }
}
