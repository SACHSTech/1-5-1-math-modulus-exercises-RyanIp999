class Power extends ConsoleProgram {

  /**
  * When given a number annd a power, program computes the answer
  * @author: Ryan Ip
  */
  
  public void run() {
  // variables
  double dblInt;
  double dblPower;
  double dblAnswer;
  
  // getting power and int

  dblInt = readDouble("Enter the number: ");
  dblPower = readDouble("Enter the power: ");
  // caculate power
  dblAnswer = Math.pow(dblPower, dblPower);

  // print answer
  System.out.println("The answer is " + dblAnswer);
  

    
  }
}