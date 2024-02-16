class Cos3rd extends ConsoleProgram {

  /**
  * Program finds the third side given 2 side lengths and the angle
  * @author: Ryan Ip
  */
  
  public void run() {
  //  variables
  double dblASide;
  double dblBSide;
  double dblAngle;
  double dblCSide;
  double dblRadian;
  // get side A
  dblASide = readDouble("Enter the length of the first side: ");
  // get side B
  dblBSide = readDouble("Enter the length of the second side: ");
  // get angle
  dblAngle = readDouble("Enter the angle between the frist and second length: ");
  // find Radian of Angle
  dblRadian = Math.toRadians(dblAngle);
  // caculate side C length
  dblCSide = Math.sqrt(Math.pow(dblASide, 2) + Math.pow(dblBSide, 2) - 2 * dblASide * dblBSide * Math.cos(dblRadian));
        
  // print answer
  System.out.println("The length of side C is " + dblCSide); 
  
  }
}