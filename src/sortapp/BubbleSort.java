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
public class BubbleSort {

    private int[] numberList;
    
    
    
    int[] sortList(int[] numbers)
    {
        
        this.numberList = numbers;
        
        // While the list is not sorted ... sort the list!
        //
        while(isSorted() == false)
        {
           for(int current = 0, next = 1; next <= numberList.length - 1; current++ , next++)
           {
               if(numberList[current] > numberList[next])
               {
                   swap(numberList, current, next);
               }// close if
               
           }// close for
              
        }// close while
        
        return this.numberList;
    }
    
    /**
     * Helper method for sortList method
     * checks if the array is sorted
     * 
     * @return 
     */
    private boolean isSorted()
    {
        //boolean sorted = false;
        
        for(int i = 0; i < numberList.length - 1; i++)
        {
            // Returns false if any number is not sorted
            if(numberList[i] > numberList[i + 1])
            {
                return false;
            }
        }
        //sorted = true;
        return true;
    }
    
    /**
     * helper method for SortList
     * swaps the values
     */
    private void swap(int[] numList, int a , int b)
    {
        int temp = numberList[b];
                   
        //swap a to b
        numList[b] = numberList[a];
                           
        // swap b to a
        numList[a] = temp;
    }
}

