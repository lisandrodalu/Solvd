public class QuikSort {
    public static void main(String[] args) {
        int[] values = {10,-1,7,6};
        quicksort(values,0,values.length-1);
        print(values);
    }
    public static void quicksort(int[] values, int first, int last){
        int i,j,aux,p;


        if(first<last) {  // cut for recursion
            p = values[(first + last) / 2]; // the one that is in the middle

            // now I have to put smaller than pivot to the left and the rest to the right
            i = first;
            j = last;
            while (i < j) {
                while (i <= j && (values[i] < p))
                    i++;
                while (i <= j && (values[j] > p))
                    j--;
                if (i < j) { // I swap
                    aux = values[i];
                    values[i] = values[j];
                    values[j] = aux;
                }
                i++;
                j--;
                //reaching pivot
            }

            //I call recursively to the function with left and right part

            quicksort(values, first, j); //left subarray
            quicksort(values, i, last); // right subarray
        }

    }
    public static void print(int[] values){
        for (int i=0;i<values.length;i++)
            System.out.print(values[i]+" ");
    }
}
