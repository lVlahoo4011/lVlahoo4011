import javax.swing.JFrame;

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

public class App {
    
    public static void mainSwticher (int choice){
        switch (choice) {
            case 0:
            break;

            case 1:
            Pyramids.main();
            break;
            
            case 2:
            Grades.gradeReporter();
            break;
            
            case 3:
            NumberPrinter.main();
            break;
      
            case 4:
            AreaCalc.main();
            break;
            
            default:
            Validation.errorReports(1, "");
            break;
        }
    }

    public static void feedback (int choice){
        switch (choice) {
            case 0:
            System.out.print("Shutting Down......\n\n");
            break;
            
            case 1:
            System.out.print("You chose: Pyramid Printer\n\n");
            break;
            
            case 2:
            System.out.print("You chose: Grade Reporter\n\n");
            break;
            
            case 3:
            System.out.print("You chose: Number Printer\n\n");
            break;

            case 4:
            System.out.print("You chose: Area Calculator\n\n");
            break;
            
            default:
            Validation.errorReports(2, "");
            break;
        }
    }


    public static void main(String[] args) {
        int choice; 
        while (0<1){
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(3);
            frame.setSize(800, 600);
            frame.setVisible(true);
            System.out.println("\n\n_____________________________________\nWelcome to the app of many functions! \n_____________________________________\n\nPlease select a number");
            System.out.println("1) Pyramid Printer");
            System.out.println("2) Grade Reporter");
            System.out.println("3) Number Printer");
            System.out.println("4) Area Calculator");
            System.out.println("\ninput \"0\" to shutdown the application");
            
            String usrPrompt = ("\nYour choice: ");
            choice = Validation.intValidate(usrPrompt);
            feedback(choice);
            mainSwticher(choice);
            if (choice == 0){break;}
        }
    }
}
