import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

    static Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int[][] myArray;
    private Scanner sc;
    int sizeWidth;
    int sizeHeight;

    Array(int sizeWidth,int sizeHeight){
        this.sizeWidth = sizeWidth;
        this.sizeHeight = sizeHeight;
        this.myArray = new int[sizeWidth][sizeHeight];
    }

    void findMin(){
        int minElement = 2147483647;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] < minElement){
                    minElement = myArray[i][j];
                }
            }
        }
        System.out.println("Minimum element: "+minElement);
    }

    void findMax(){
        int maxElement = 0;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] > maxElement){
                    maxElement = myArray[i][j];
                }
            }
        }
        System.out.println("Maximum element: "+maxElement);
    }

    void showMyArray(){
        System.out.println("Here is your array:");
        for (int i = 0; i < myArray.length; i++)
        {
            for (int j = 0; (myArray[i] != null && j < myArray[i].length); j++) {
                System.out.print(myArray[i][j] + " ");
            }

            System.out.println();
        }
    }

    void findAverage(){
        int arraySum = 0;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                arraySum+=myArray[i][j];
            }
        }
        double arrayAverage = Double.valueOf(arraySum)/(Double.valueOf(sizeWidth)*Double.valueOf(sizeHeight));
        System.out.println("Average: "+arrayAverage);;
    }

    void findAverageGeometric(){
        int arrayMultiply = 1;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                arrayMultiply*=myArray[i][j];
            }
        }

        double degree = 1/(Double.valueOf(sizeWidth)*Double.valueOf(sizeHeight));
        double arrayAverageGeometric = Math.pow(arrayMultiply, degree);
        System.out.println("Average Geometric: "+arrayAverageGeometric);;
    }



    void setArray(){
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                System.out.println("Enter the "+i+"/"+j+" element");
                Integer currentItem = Integer.valueOf(scanner.nextLine());
                myArray[i][j] = currentItem;
            }
        }

    }
    void setRandomArray(){
        int min = -100;
        int max =100;
        for(int i=0; i<myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                int diff = max - min;
                myArray[i][j] = random.nextInt(diff + 1);
                myArray[i][j]+= min;
            }
        }
    }

}
