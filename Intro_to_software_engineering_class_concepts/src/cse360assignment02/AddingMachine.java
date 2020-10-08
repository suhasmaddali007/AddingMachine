package cse360assignment02;
/**
 * Adding Machine is used to add or subtract
 * numbers starting from 0, depending on the
 * method that is called. 
 * @author suhas maddali
 *
 */
public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /**
   * The following method returns the present total 
   * of the operations that were performed previously
   * @return
   */
  public int getTotal () {
    return 0;
  }
  /**
   * The add method takes an integer value as an parameter
   * and adds this integer argument to the total that is 
   * initially 0
   * @param value
   */
  public void add (int value) {
  }
  /**The subtract method takes an integer value as an parameter
   * and subtracts this integer argument from the total
   * @param value
   */

  public void subtract (int value) {
  }
/**The toString method returns a string of all the operations 
 * that were previously performed so that the user could get an
 * idea about the overall operation in the form of a string
 */
  public String toString () {
    return "";
  }
/**The clear method makes the total 0 so that the user has to 
 * invoke other methods to get new outputs
 */
  public void clear() {
  }
}