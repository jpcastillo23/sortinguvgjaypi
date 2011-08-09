
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JayPiCastillo
 */
public class selectionSort {
    public int[] answer;
    public selectionSort(int[] matriz, boolean which){
        int numUnsorted = matriz.length;
        int index;
        int max;
        if(which){
            while(numUnsorted>0){
                //Determine maximum Value in array
                max=0;
                for(index =1;index < numUnsorted ;index++){
                    if(matriz[max]< matriz[index])
                        max=index;
                }
                swap(matriz,max,numUnsorted-1);
                numUnsorted--;
            }
        }
        else{
              matriz=quickSort(matriz,matriz.length);        
        }
        answer=matriz;
    }
    public static void swap(int[] data,int i , int j){
        //this method create the interchange
        int temp;
        temp = data[i];
        data[i]= data[j];
        data[j] = temp;
    }
    public int[] getMatriz(){
        return answer;
    }
    
    private static int partition(int data[], int left, int right){
        // pre: left <= right 
        // post: data[left] placed in the correct (returned) location
    
        while (true) {
            // move right "pointer" toward left 
            while (left < right && data[left] < data[right]) right--; 
                if (left < right) 
                    swap(data,left++,right); 
                else return left; 
            // move left pointer toward right 
            while (left < right && data[left] < data[right]) left++; 
                if (left < right) 
                    swap(data,left,right--); 
                else return right;
        }
    }
    public static int[] quickSort(int[] data, int n){
        quickSortRecursive(data,0,n-1);
        return data;
    }
    private static void quickSortRecursive(int[] data,int left,int right){
        // pre: left <= right 
        // post: data[left..right] in ascending order 
    int pivot;	
    // the final location of the 
    if (left >= right) return; 
    pivot = partition(data,left,right);	/* 1- place pivot*/
    quickSortRecursive(data,left,pivot-1); /*2.- sprt small*/
    quickSortRecursive(data,pivot+1,right);/* 3.- sort Large*/
    /* done! */
    }

    
    
}
