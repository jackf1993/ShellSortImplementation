/* author: Jack Farah
 * description: Implementation of Shell Sort time complexity of O(n^2). Shell sort has the potential
 *              to go as fast as O(nlogn), but I used a Gap of array.length/2 for implementation
 *              simplicity's sake.
 */

public class Main {

    public static void main(String[] args) {

        int []array = {2, 5, 4, 6, 1, 3, 7}; // create unsorted array

        for(int gap = array.length/2 ; gap >0; gap /=2){  // gap iteration for loop with gap being set to array.length/2

            for(int i = gap; i < array.length; i++){  // 1st nested loop to iterate through the array
                int newElement = array[i];  //beginning of "insertion sort" by setting newElement to the element to compare.

                int j;

                for(j=i; j >=gap && array[j -gap] > newElement; j -= gap){ //.........2nd nested loop to iterate through elements
                    array[j] = array[j - gap]; //if the conditions above are true,    // based off of the gap difference.
                    array[j-gap] = newElement; // then we implement the swap/shift.
                }
            }
        }

        for(int i =0; i < array.length; i++){ //print array
            System.out.print(array[i] +" ");
        }
        System.out.print("\b");

    }
}
