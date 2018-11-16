import java.text.*;
import java.io.*;
import java.util.*;


public class Main {
 /* This class uses ArrayList of Triangle objects to
    calculate their total area and total perimeter.
*/
    /** Creates a new instance of Main */
    public Main() {
    }

    // this method is used to read the sides
    public static double input(BufferedReader r, String prompt) throws IOException {
        // needs additional validation
        double side=0.0;
        try {
            System.out.println("Please enter "+ prompt); //'prompt' is a formal parameter - String
            String myString = r.readLine();
            side = Double.parseDouble(myString);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Please enter a number!\n" + nfe);
            // more code for handling the exception here
        }
        return side;
    }

    public static void main(String[] args) throws IOException {
        // Array list will be used instead of an array?!
        ArrayList aList = new ArrayList();    // Created with default size (10).
        // ArrayList alist2 = new ArrayList(100); // Starts with 100 elements
        Triangle ob = new Triangle(); // will be used as work object
        int choice = 0;     //for the user choice
        double side1, side2, side3;
        boolean ExceptNotThrown;   // if an exception is thrown
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        do  {
            try {
                ExceptNotThrown = false;   // if exception is thrown
                System.out.print(" Please choose a triangular object to add ");
                System.out.println("(1: General; 2: Equilateral; 3: Right; 0: None):");
                String myString = br.readLine();   //reads a line (string) from the buffer br
                //Parses the string argument as int
                choice = Integer.parseInt(myString);
            }
            catch (NumberFormatException nfe) {
                ExceptNotThrown = true;
//             System.err.println(nfe);
                System.out.println("Please enter a number!\n" + nfe);
            }
            switch (choice) {
                case 1:
                    side1 = input(br, "side1: ");
                    side2 = input (br, "side2: ");
                    side3 = input (br, "side3: ");
                    Triangle tri = new Triangle(side1, side2, side3);
                    aList.add(tri);
                    break;
                case 2:
                    side1 = input(br, "side: ");
                    EquilateralTriangle equi = new EquilateralTriangle(side1);
                    aList.add(equi);
                    break;
                case 3:
                    side1 = input(br, "side1: ");
                    side2 = input (br, "side2: ");
                    RightTriangle rig = new RightTriangle(side1, side2 );
                    aList.add(rig);
                    break;
                case 0:
                    ExceptNotThrown = false;
                    break;
                default:
                    System.out.println("\n Wrong choice!");
                    ExceptNotThrown = true;
                    break;
            }

        } while (ExceptNotThrown);  //will repeat the input

        if (!ExceptNotThrown) {  // will skip 'the if body' if an exception was thrown
            double totalA, totalP; // for the total area and total perimeter
            System.out.println("\n Objects \t\t\t area \t\t perimeter: ");
            // To accumulate the total area and perimeter
            totalA = totalP =0.0;
            // In this loop each object from the array list will be extracted
            // and its name, area, and perimeter printed out.
            for(int i = 0; i < aList.size(); i++) {
                ob = (Triangle)aList.get(i);		//get the objects in turn
                System.out.print (ob.displayName());
                System.out.print ("\t--> "+ ob.area());
                System.out.println (" \t: "+ ob.perimeter());
                totalA +=  ob.area();			//accumulate the total area
                totalP +=  ob.perimeter();		//same for the perimeter
            }
    /*  if you would like to specify the number of fraction digits,
        use the NumberFormat abstract class.
     */
            NumberFormat nf; // this is not an object
            //Returns a general-purpose number format for the current default locale
            nf = NumberFormat.getNumberInstance();
            nf.setMaximumFractionDigits(3); // to specify the number of fraction digits
            String areaTotal = nf.format(totalA); // convert to String
            double perimTotal = Float.parseFloat(nf.format(totalP));
            System.out.print("\nTotal area and average perimeter are:");
            System.out.println("\t\t" + areaTotal+ " :    " + perimTotal /aList.size());
        } // end if
    }// end main()
} // end class
