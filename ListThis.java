public class ListThis {
    public static void main(String[] args){
        System.out.println("");
    }

    public static void feedback (int choice){
        switch (choice) {
            case 1:
            System.out.print("You chose: Number lister\n\n");
            break;
            
            case 2:
            System.out.print("You chose: Text lister\n\n");
            break;
            
            case 0:
            System.out.print("__________________________\nNumber Printer Closing...\n__________________________\n");
            break;

            default:
            Validation.errorReports(2, "");
            break;
        }
    }

    public static void mainSwticher (int choice){
        switch (choice) {
            
            case 1:
            numList();
            break;
            
            case 2:
            txtList();
            break;

            default:
            Validation.errorReports(1, "");
            break;
        }
    }

    public static void numList(){
        System.out.println("Ready to Listener");
        


    }

    public static void txtList(){
        System.out.println("");
    }

    public static void main(){
        System.out.println("__________________________\nList Listener Initialized!\n");
        int choice;
        
        while (0<1){
            System.out.println("Please select a print type");
            System.out.println("1) Number Lister");
            System.out.println("2) Text Lister");
            System.out.println("\ninput \"0\" to go Back");
            String usrPrompt = ("\nYour choice: ");
            
            choice = Validation.intValidate(usrPrompt);
            feedback(choice);
            if (choice == 0) {break;}
            mainSwticher(choice);
        }
    }
}


