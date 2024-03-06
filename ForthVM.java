import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

/*
    1. Get input from user
    2. Break the input up by white spaces
    3. Check what inputs numbers and add them to the stack
    4. Check for keywords and call their corresponding function
    5. Check if user is creating a new variable and add the next word to an array of variables
 */

public class ForthVM {

    public static void main(String[] args){

        ArrayList<Integer> mainStack = new ArrayList<>();
        Scanner inputScanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();  // Using ArrayList for dynamic sizing
        input.add("");
        while(!Objects.equals(input.get(0), "exit")){
            input = getNextInput(inputScanner);
            // Check if there are any operations to be done
            // Do operations
            // Add results of operations and the rest of the input to the stack
        }


    }

    private static ArrayList<String> getNextInput(Scanner inputScanner){
        String[] input = inputScanner.nextLine().split(" ");
        return new ArrayList<>(Arrays.asList(input));

    }

}
