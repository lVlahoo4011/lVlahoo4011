public class Grades {
    public static void main (String[] args){
        System.out.println("");
    }
    public static String marksToGrade(int marks){
        if(marks>=80 && marks<=100){
            return ("HD (High Distinction)");}

        else if(marks>=75){
            return ("DN (Distinction)");}

        else if(marks>=60){           
            return ("CR (Credit)");}

        else if(marks>=50){           
            return ("P (Pass)");}

        else if(marks>=0){           
                return ("F (Fail)");}
            
        else {
            return ("Error, Invalid input");
        }
    }
    public static void gradeReporter (){
        System.out.println("__________________________\nGrade Printer Initialized!\n__________________________\n");
        int marks; 
        while (0<1){
            String usrPrompt = ("Please enter your marks: ");
            marks = Validation.intValidate(usrPrompt);

            if (marks <0 || marks >100){
                Validation.errorReports(4, "");}
            
            else {
                break;}
        }
        System.out.println("You have received a " + marksToGrade(marks) + " grade");
        gradeAdvice(marksToGrade(marks));
    }
    public static void gradeAdvice (String grade){
        switch (grade) {
            case "HD (High Distinction)":
                System.out.println("Excellent Work!");
                break;

            case "DN (Distinction)":
                System.out.println("Well Done!");
                break;

            case "CR (Credit)":
                System.out.println("Congratulations");
                break;

            case "P (Pass)":
                System.out.println("You Passed!");
                break;
            
            default:
                System.out.println("Better Luck Next Time :(");
                break;
        }
    }
}
