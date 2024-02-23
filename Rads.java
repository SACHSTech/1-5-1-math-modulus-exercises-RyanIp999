class Rads extends ConsoleProgram {

  /**
  * Program that changes the inputed degree into radian mesures
  * @author: Ryan Ip
  */
  
  public void run() {
    
  // Variables
  double dblDegree;
  double dblRadian;
  // Get degree
  dblDegree = readDouble("enter degree: ");
  // caculate radian
  dblRadian = Math.toRadians(dblDegree);
  // print radian
  System.out.println("the radian is " + dblRadian);

    
  }
}