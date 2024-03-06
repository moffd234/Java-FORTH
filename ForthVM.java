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

        String mainStack = "";
        Scanner inputScanner = new Scanner(System.in);
        String input = "";
        while(!Objects.equals(input, "exit")){
            input = getNextInput(inputScanner);

        }


    }

    private static String getNextInput(Scanner inputScanner){
        return inputScanner.nextLine();
    }

}
