import java.util.Arrays;
import java.util.Collections;

public class Arr {
    public static void main(String[] args) {

        // it create 4 index or 5 value.it can't take more than 5 value.
        int[] marks = new int[5];

        System.out.println(" default first value = " + marks[0]);// here it show default value 0.

        // value assign kora hoyeche.
        marks[0] = 85;
        marks[1] = 80;
        marks[2] = 75;
        marks[3] = 95;
        marks[4] = 70;

        System.out.println(" value = " + marks[0]);
        System.out.println(" value = " + marks[1]);
        System.out.println(" value = " + marks[2]);
        System.out.println(" value = " + marks[3]);
        System.out.println(" value = " + marks[4]);

        // to show by array type
        System.out.println(Arrays.toString(marks));

        // for loop
        for (int i = 0; i < marks.length; i++) {
            System.out.println("index " + i + " = " + marks[i]);
        }

        // for each loop
        for (int i : marks) {
            System.out.println(i);
        }

        // problem solve (max ,min value) by for each loop

        int[] score = { 10, 20, 30, 40, 50 };

        int max = score[0];
        int min = score[0];

        for (int s : score) {
            if (s > max) {
                max = s;
            }
            if (s > min) {
                min = s;
            }

        }

        System.out.println("for each max = " + max);
        System.out.println("for each min = " + min);

 // problem solve (max ,min value) by for loop

        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }
            if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

// sort array (default ascending)
int[] sort ={20,50,30,90};
Arrays.sort(sort);
System.out.println(Arrays.toString(sort));

// descending
Integer[] sort2 ={20,50,30,90};
Arrays.sort(sort2,Collections.reverseOrder());
System.out.println(Arrays.toString(sort2));

// sort some index

Integer[] sort3 ={20,50,30,90};
Arrays.sort(sort3,1,3);
System.out.println(Arrays.toString(sort3));

// sort string
String [] fruit ={"apple","orange","moango","banana","pine"};
Arrays.sort(fruit);
System.out.println(Arrays.toString(fruit));

Arrays.sort(fruit,Collections.reverseOrder());
System.out.println(Arrays.toString(fruit));

// sort small length to large length

Arrays.sort(fruit,(a,b)-> a.length() - b.length());
System.out.println(Arrays.toString(fruit));

// sort large length to small length
Arrays.sort(fruit,(a,b)-> b.length() - a.length());
System.out.println(Arrays.toString(fruit));

// parallelSort =

Arrays.parallelSort(fruit);
System.out.println(Arrays.toString(fruit));

// copy array
int [] abc={10,60,50,20,30};
int [] lmn =Arrays.copyOf(abc,abc.length);
abc[0]=100;
lmn[1]=200;
System.out.println("abc = "+Arrays.toString(abc));
System.out.println("lmn = "+Arrays.toString(lmn));

// reverse array
int[]rever={5,6,7,1,5,3,4};
for(int i = rever.length-1; i>=0;i--){System.out.println(rever[i]+" ");}

int[] arr = {5,6,7,1,3,4};
for (int i = 0; i < arr.length/2 ; i++) {
    int tem =arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=tem;
}
System.out.println(Arrays.toString(arr));

// Multi-dimention array

int [][] matrix={ //here int[][] means int array er array
    {1,2,3}, // index 0 .0 index er 0 index er value = 1 ,1 index er value = 2,2 index er value = 3
    {4,5,6}, // index 1 .1 index er 0 index er value = 4 ,1 index er value = 5,2 index er value = 6
    {7,8,9}  // index 2 .2 index er 0 index er value = 7 ,1 index er value = 8,2 index er value = 9
};

System.out.println(Arrays.deepToString(matrix));

//solve by for loop

for(int row=0;row < matrix.length;row++){

    for(int col=0; col < matrix[row].length ;col++)

{System.out.println(matrix[row][col]+" ");}

  System.out.println();  
}

// solve by for each loop

int [][] jog={ 
    {1,2,3}, 
    {4,5,6}, 
    {7,8,9}
};

for(int[] arr2 : jog){
    for (int val : arr2){System.out.println(val+" ");}
    System.out.println();
}











    }
}
