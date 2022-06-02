import java.util.Scanner;

public class Validation { 
    public static void errorReports (int code, String prompt){
        String desc;
        switch (code){
            case 1:
                desc = "invalid Input, ";
                break;
            case 2:
                desc = "Invalid option selected, ";
                break;
            case 3:
                desc = "Please Input a Whole Number, ";
                break;
            case 5:
                desc = "Please Input a Valid Number, ";
                break;
            case 4:
                desc = "Input Out of Range, ";
                break;
            default:
                desc = "you messed up the code.";
                break;
        }
        System.out.println("Error: " + desc + "Please try Again" + prompt);
    }

    public static int intValidate(String prompt){
        System.out.print(prompt);
        try (Scanner usrIn = new Scanner(System.in)) {
            try {
                return Integer.parseInt(usrIn.next());
            } catch(NumberFormatException ne) {
                errorReports(3, prompt);
                return 0;
            }
        }
    }
    
    public static float floatValidate(String prompt){
        System.out.print(prompt);
        try (Scanner usrInFloat = new Scanner(System.in)) {
            try {
                return Float.parseFloat(usrInFloat.next());
            } catch(NumberFormatException ne) {
                errorReports(5, prompt);
                return 0;

            }
        }
    }
    
    public static String stringInput(String prompt){
        System.out.print(prompt);
        try (Scanner usrIn = new Scanner(System.in)) {
            return (usrIn.nextLine());
        }
    }

    public static void main (String[] args){
        System.out.println("");
    }
}