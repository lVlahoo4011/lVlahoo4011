public class NumberPrinter {
    public static void main (String[] args){
        System.out.println("");
    }

    
    public static void mainSwticher (int choice){
        int min;
        int max;
        String usrPrompt;
        switch (choice) {
            case 1:
            usrPrompt = ("Please input the range minimum: ");
            min = Validation.intValidate(usrPrompt);
            usrPrompt= ("Please input the range maximum: ");
            max = Validation.intValidate(usrPrompt);
            oddPrtinter(min, max);
            break;
            
            case 2:
            usrPrompt = ("Please input the range minimum: ");
            min = Validation.intValidate(usrPrompt);
            usrPrompt= ("Please input the range maximum: ");
            max = Validation.intValidate(usrPrompt);
            evenPrtinter(min, max);
            break;
            
            // case 3:
            // System.out.println("");
            // break;
            
            default:
            Validation.errorReports(1, "");
            break;
        }
    }

    public static void oddPrtinter (int min, int max) {
        for(; (min<=max); min++){
            if ((min%2)==0) {min++;}
            if(min!=max){
                System.out.print(min + ", ");}
        }
        System.out.println("Print Completed!\n");
    }

    public static void evenPrtinter (int min, int max) {
        for(; (min<=max); min++){
            if ((min%2)==1) {min++;}
            if(min!=max){
                System.out.print(min + ", ");}
        }
        System.out.println("Print Completed!\n");
    }

    public static void feedback (int choice){
        switch (choice) {
            case 1:
            System.out.print("You chose: Odd Number Printer\n\n");
            break;
            
            case 2:
            System.out.print("You chose: Even Number Printer\n\n");
            break;
            
            case 0:
            System.out.print("__________________________\nNumber Printer Closing...\n__________________________\n");
            break;

            default:
            Validation.errorReports(2, "");
            break;
        }
    }
    public static void main (){
        int choice;
        System.out.println("___________________________\nNumber Printer initialized! \n___________________________\n");
        while (0<1){
            System.out.println("Please select a print type");
            System.out.println("1) Odd numbers");
            System.out.println("2) Even Numbers");
            System.out.println("\ninput \"0\" to go Back");
            String usrPrompt =("\nYour choice: ");
            
            choice = Validation.intValidate(usrPrompt);
            feedback(choice);
            if (choice == 0) {break;}
            mainSwticher(choice);
            
        }
    }
}
