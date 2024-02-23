class Circumference extends ConsoleProgram {

  /**
  * program that computes the circumference of a cricle given a radius
  * @author:
  */
  
  public void run() {
    
   
    // declare variables
    double dblRadius;
    double dblCircumference;
    // get radius
    dblRadius = readDouble("enter the radius: ");
    // caculate circumferance
    dblCircumference = 2 * Math.PI * dblRadius;
    // output results
    System.out.println("the cirfumference of the circle is " + dblCircumference);
  }
}