class FtoC extends ConsoleProgram {

  /**
  * when given the farenheit, the program will compiute the celcius
  * @author: Ryan Ip 
  */
  
  public void run() {
    // variables
    double dblFar;
    double dblCel;
    
    // getting  farenheit
    dblFar = readDouble("Enter in the farenheit: ");

    // convert to celcius
    dblCel = (dblFar - 32) * 5/9;

    // print answer
    System.out.println("The celcius is " + dblCel);

  

    
    
  }
}