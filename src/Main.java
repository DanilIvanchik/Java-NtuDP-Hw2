import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    public static void start(){

        try {
            System.out.println("Enter the width of your matrix (n)");
            Integer sizeWidth = Integer.valueOf(scanner.nextLine());

            System.out.println("Enter the height of your matrix");
            Integer sizeHeight = Integer.valueOf(scanner.nextLine());

            if (sizeHeight<1 | sizeHeight>20){
                System.out.println("Incorrect value, the allowable range of variables is from 1 to 20");
                start();
            } else if (sizeWidth<1 | sizeWidth>20) {
                System.out.println("Incorrect value, the allowable range of variables is from 1 to 20");
                start();
            }

            Array myArray = new Array(sizeWidth,sizeHeight);
            myArray.setArray();
            mainFunctions(myArray);

        }catch (Exception ex){
            System.out.println("Incorrect value, try again with the numbers");
            start();
        }

    }
    public static void mainFunctions(Array myArray){

        System.out.println("Choose your option, enter the number: \n1)Show my array \n2)Find min \n3)Find max \n4)Find average \n5)Find average geometric \n6)Choose another option \n7)Restart \n8)Exit \n9)Reset matrix with random numbers");

        try {
            Integer currentOption = Integer.valueOf(scanner.nextLine());
            switch (currentOption){
                case 1:
                    myArray.showMyArray();
                    mainFunctions(myArray);
                    break;
                case 2:
                    myArray.findMin();
                    mainFunctions(myArray);
                    break;
                case 3:
                    myArray.findMax();
                    mainFunctions(myArray);
                    break;
                case 4:
                    myArray.findAverage();
                    mainFunctions(myArray);
                    break;
                case 5:
                    myArray.findAverageGeometric();
                    mainFunctions(myArray);
                    break;
                case 6:
                    mainFunctions(myArray);
                    break;
                case 7:
                    start();
                    break;
                case 8:
                    System.out.println("Zzz...");
                    System. exit(0);
                    break;
                case 9:
                    myArray.setRandomArray();
                    mainFunctions(myArray);
                default:
                    System.out.println("Error! Choose correct function!");
                    mainFunctions(myArray);
            }
        }catch (Exception ex){
            System.out.println("Incorrect value, try again with the numbers");
            start();
        }

    }
}
