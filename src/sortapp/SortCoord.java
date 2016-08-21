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
public class SortCoord {

    private BubbleSort bSort;
    private QuickSort qSort;
    
    
    
    /**
     * 
     */
    public SortCoord()
    {
        
        
        bSort = new BubbleSort();
        qSort = new QuickSort();
    }
    
    /**
     * 
     * @param numbers
     * @return 
     */
    public int[] bubbleSort(int[] numbers)
    {
        
        return bSort.sortList(numbers);
    }
    
    /**
     * 
     * @param numbers
     * @return 
     */
    public int[] quickSort(int[] numbers)
    {
        return qSort.quickSort(numbers, 0, numbers.length - 1);
    }
}

