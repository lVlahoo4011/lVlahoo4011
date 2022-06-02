// import java.io.*;
import javax.swing.ImageIcon;


public class TestRoom {
    public static void main(String[] args){
        System.out.println ("bepis");
        ImageIcon image = new ImageIcon("MNU COMP SCI.jpg");
        new MyJFrame(image);
    }

//     public static void window(){
//         JFrame frame = new JFrame();
//         ImageIcon image = new ImageIcon("MNU COMP SCI.jpg");

//         frame.setTitle("Test Room");
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setResizable(false);
//         frame.setSize(420,420);
//         frame.setVisible(true);
//         frame.setIconImage(image.getImage());
//         frame.getContentPane().setBackground(new Color(0x234567));
        
//     }


    
//     public static void main(String[] args){
//         System.out.println("testroom1");
//         // questionA();
//         // questionB();
//         // questionC();
//         // questionD();
//         // question1();
//         // question2();
//         // question3();
//         // intToFloat();
//         //upperCaseIfy();
//         datReader();
//     }

//     public static void datReader(){

//         try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\OneDrive\\Documents\\Codes\\Java\\CPT205\\src\\TestData.txt"))) {
//             String str;
//                 while ((str = br.readLine()) != null){
//                     System.out.println(str);
//                 }
//             } catch (IOException ie){
//                 System.out.println("exception");
//             }

//     }
    // public static void intToFloat (){
    //     float intToFloatVal= Validation.intValidate("input an integer: ");
    //     System.out.println("you input " + intToFloatVal);
    // }

    // public static void upperCaseIfy (){
    //     String inputString = Validation.stringInput("input a sentence and i'll scream it back: ");
    //     String outputString = "";
    //     char c;

    //     for (int i = 0; i< inputString.length(); i++){
    //         c = inputString.charAt(i);
    //         if (c >= 97 && c<= 122) {
    //             c = (char) (c-32); 
    //         }
    //         outputString = outputString + c;
    //     }
    //     System.out.println(outputString);


    // }


    // public static void questionA(){
    //     System.out.println("\\n\\nQUESTION A");
    //     String [] strArr = new String[10];
    //     for(int i= strArr.length - 1; i >= 0; i--){
    //         strArr[i] = strArr[i] = "b" +(i-1);
    //     }
    //     System.out.println("Value: "+ strArr[5]);
    // }
    // public static void questionB(){
    //     System.out.println("\\n\\nQUESTION B");
    //     double[] dblArr = {3.5, 6.8, 2.3, 9.1, 1.0};

    //     for (int i =0; i<dblArr.length; i++){
    //         dblArr[i] /=2; 
    //     }
    //     for (int i =dblArr.length-1; i>=0; i--){
    //         System.out.println("Value: " + dblArr[i]);
    //     }
    // }
    // public static void questionC(){
    //     System.out.println("\\n\\nQUESTION C");
    //     int[] intArr = {1,2,3,4,5};
    //     double[] dblArr = {0.5,1,1.5,2,2.5};

    //     for (int i = 0; i < intArr.length; i++){
    //         dblArr[i] = (dblArr[i] * intArr[i]);
    //     }
    //     for (int i = 0; i < intArr.length; i++){
    //         System.out.println(intArr[i] + ": " + dblArr[i]);
    //     }
    // }
    // public static void questionD(){
    //     System.out.println("\\n\\nQUESTION D");
    //     int[] intArr = {1,2,3,4,5,6,7,8,9,10};

    //     for(int i = 0; i < intArr.length; i+=3){
    //         System.out.println("Value: " + intArr[i]);
    //     }
    // }
    // public static void question1(){
    //     System.out.println("\\n\\nQUESTION 1");
    //     int[] intArr = {1,2,3,4,5,6,7,8,9};
    //     for(int i= 1; i<9; i+=2){
    //         System.out.print(intArr[i] + ", ");
    //     }
    // }

    // public static void question2(){
    //     System.out.println("\\n\\nQUESTION 2");
    //     String [] strArr = new String [5];
    //     String sep = " ";
    //     for(int i= 0; i< strArr.length; i++){
    //         System.out.print(sep + strArr[i]); 
    //         sep=", ";
    //     }
    // }

    // public static void question3(){
    //     System.out.println("\\n\\nQUESTION 3");
    //     int[] intArr = new int [5];
    //     for(int i= 0; i< intArr.length; i++){
    //         intArr[i]= (i *2);
    //     }
    //     for(int i= 0; i< intArr.length; i++){
    //         System.out.print(intArr[i]+", ");
    //     }
    // }


}
