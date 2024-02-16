class AreaSin extends ConsoleProgram {

  /**
  * Given 2 side lengths and an angle, program will compute the area of the triangle
  * @author: Ryan Ip
  */
  
  public void run() {
  double dblASide;
  double dblBSide;
  double dblAngle;
  double dblArea;
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
  dblArea = (dblASide * dblBSide * Math.sin(dblRadian)) / 2;
  System.out.println("The area of the triangle is " + dblArea);
  }
}