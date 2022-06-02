public class AreaCalc{
    public static void feedback (int choice){
        switch (choice) {
            case 1:
            System.out.print("You chose: Rectangle Calculator\n\n");
            break;
            
            case 0:
            System.out.print("__________________________\nArea Calculator Closing...\n__________________________\n");
            break;

            default:
            Validation.errorReports(2, "");
            break;
        }
    }

    public static void mainSwticher (int choice){
        int polyCount;
        String usrPrompt;
        switch (choice) {
            
            case 1:
            usrPrompt =("How many Rectangles to calculate for? : ");
            polyCount = Validation.intValidate(usrPrompt);
            rectangleCalc(polyCount);
            break;

            default:
            Validation.errorReports(1, "");
            break;
        }
    }

    public static void main(){   
    int choice;
    System.out.println("____________________________\nArea Calculator initialized! \n____________________________\n");
    while (0<1){
        System.out.println("Please select a Polygon to calculate for");
        System.out.println("1) Rectangles");
        System.out.println("\ninput \"0\" to go Back");
        String usrPrompt =("\nYour choice: ");
        
        choice = Validation.intValidate(usrPrompt);
        feedback(choice);
        if (choice == 0) {break;}
        mainSwticher(choice);
        
        }
    }

    public static void rectangleCalc (int polyCount){
        System.out.println("Calculating area for " + polyCount + " Rectangles \n");
        Rectangle[] rect = new Rectangle[polyCount];
        float length;
        float width;
        for (int i = 0; i < (polyCount); i++){
            System.out.println("Inputting data for Rectangle " + (i+1)+ ": \n");
            // rect[i]= [1];
            length= Validation.floatValidate("Please input the Length of Rectangle " + (i+1) + ": ");
            width= Validation.floatValidate("Please input the Width of Rectangle " + (i+1) + ": ");
            
            rect[i] = new Rectangle(length, width);
            
            System.out.println("\nThe area of rectangle " + i +" is :" + rect[i].getArea()+ "\n\n");
        }

        System.out.println("__________________________________________________\nInputing data complete, here are your rectangles: ");

        for(int i = 0; i < polyCount; i++){
            System.out.println("Rectangle " + (i+1) + ": " );
        }
    }

    public static void main (String[] args){
        System.out.println("");
    }

}