/*
 * Andrew Thompson
 * April 21, 2020
 * Program that transforms a tuple recursively, and tells the user the number of recursions
 */
package fourtupletransformation;

/**
 *
 * @author tiein
 */

import javax.swing.JOptionPane;

public class FourTupleTransformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
        boolean flag = false;
        
        while(!flag){//input guards to prevent invalid inputs. Loop until valid input
            try{
                String input = JOptionPane.showInputDialog("Enter the first number of the tuple.");
                
                if(input != null){
                    num1 = Integer.parseInt(input);//try to parse input to an int
                    flag = true;
                }else{//if null, cancel buton is pressed, and exit program
                    System.exit(0);
                }
            }catch(NumberFormatException nfe){//inform user about invalid input
                System.err.println("Please enter an integer.");
            }
        }
        flag = false;//reset flag
        
        while(!flag){//same as above
            try{
                String input = JOptionPane.showInputDialog("Enter the second number of the tuple.");
                
                if(input != null){
                    num2 = Integer.parseInt(input);
                    flag = true;
                }else{
                    System.exit(0);
                }
            }catch(NumberFormatException nfe){
                System.err.println("Please enter an integer.");
            }
        }
        
        flag = false;
        
        while(!flag){//same as above
            try{
                String input = JOptionPane.showInputDialog("Enter the third number of the tuple.");
                
                if(input != null){
                    num3 = Integer.parseInt(input);
                    flag = true;
                }else{
                    System.exit(0);
                }
            }catch(NumberFormatException nfe){
                System.err.println("Please enter an integer.");
            }
        }
        
        flag = false;
        
        while(!flag){//same as above
            try{
                String input = JOptionPane.showInputDialog("Enter the fourth number of the tuple.");
                
                if(input != null){
                    num4 = Integer.parseInt(input);
                    flag = true;
                }else{
                    System.exit(0);
                }
            }catch(NumberFormatException nfe){
                System.err.println("Please enter an integer.");
            }
        }
        
        //calculate transformation and output to user
        fourTupleTrans(num1, num2, num3 , num4, 0);
    }
    
    
    
    public static void fourTupleTrans(int a, int b , int c, int d, int stepNum){
        if(!(a == 0 || b == 0 || c == 0 || d == 0)){//if none are sero, update to new values, and call recursively
            int newA = Math.abs(a-b);
            int newB = Math.abs(b-c);
            int newC = Math.abs(c-d);
            int newD = Math.abs(d-a);
            stepNum++;//increment the number of steps performed
            fourTupleTrans(newA, newB, newC, newD, stepNum);//call recursively
        } else{
            //if any are zero, output tthe number of steps and the final tuple
            System.out.println("Number of recursion = " + stepNum + " (" + a + ", " + b + ", " + c + ", " + d + ")");
        }
   }
    
    
}
