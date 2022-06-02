public class Pyramids {
    public static void main (String[] args){
        System.out.println("");
        main();
    }
    public static void pyramidHalf(int height) {
        System.out.println("Printing Half Pyramid (height: " + height + " rows)\n");
        for (int i = 0; i < height; i++) {

            for(int j= i; j>=0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    
    // public static void pyramidTwo() {
    //     System.out.println("Printing Pyramid type x\n");
    //     int k;
    //     for (int i = 5; i >= -5; i--) {
            
    //         if (i<0) {
    //             k = (i*-1);}
    //         else {
    //             k = i;}

    //         for(int j= k; j>0; j--){
    //             System.out.print("*");}
            
    //             i--;
    //         if (i!=0) {System.out.println("");}
    //     }
    //     System.out.println("\n");
    // }

    public static void pyramidFull(int height) {
        System.out.println("Printing Full Pyramid (height: " + height + " rows)\n");
        for (int i = 0; i < height; i++) {
            
            for(int k= (i+1); k<height; k++) {
                System.out.print(" ");
            }

            for(int j= (((i+1)*2)-2); j>=0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static void pyramidInvert(int height) {
        System.out.println("Printing Inverted Pyramid (height: " + height + " rows)\n");
        for (int i = height; i > 0; i--) {
            
            for(int k= (i); k<height; k++) {
                System.out.print(" ");
            }

            for(int j= ((i*2)-2); j>=0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }

    public static void feedback (int choice){
        switch (choice) {
            case 0:
            System.out.print("__________________________\nPyramid Printer Closing...\n__________________________\n");
            break;

            case 1:
            System.out.print("You chose: Half Pyramid\n\n");
            break;
            
            case 2:
            System.out.print("You chose: Full Pyramid\n\n");
            break;
            
            case 3:
            System.out.print("You chose: Inverted Pyramid\n\n");
            break;
            
            default:
            Validation.errorReports(2, "");
            break;
        }
    }
    
    public static void mainSwticher (int choice){
        int height;
        String usrPrompt;
        switch (choice) {
            
            case 1:
            usrPrompt =("Please input the number of rows for the pyramid: ");
            height = Validation.intValidate(usrPrompt);
            pyramidHalf(height);
            break;
            
            case 2:
            usrPrompt =("Please input the number of rows for the pyramid: ");
            height = Validation.intValidate(usrPrompt);
            pyramidFull(height);
            break;
            
            case 3:
            usrPrompt =("Please input the number of rows for the pyramid: ");
            height = Validation.intValidate(usrPrompt);
            pyramidInvert(height);
            break;

            default:
            Validation.errorReports(1, "");
            break;
        }
    }

    public static void main() {
        System.out.println("____________________________\nPyramid Printer initialized!\n____________________________\n");
        int choice;
        
        while (0<1){
            System.out.println("Please select a print type");
            System.out.println("1) Half Pyramid");
            System.out.println("2) Full Pyramid");
            System.out.println("3) Inverted Pyramid");
            System.out.println("\ninput \"0\" to go Back");
            String usrPrompt= ("\nYour choice: ");
            
            choice = Validation.intValidate(usrPrompt);
            feedback(choice);
            if (choice == 0) {break;}
            mainSwticher(choice);
            
        }
    }
}