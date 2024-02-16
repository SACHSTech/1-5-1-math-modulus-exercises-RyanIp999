class Hours extends ConsoleProgram {

  /**
  * coverts hours to days and hours
  * @author: Ryan Ip
  */
  
  public void run() {
  // variables
  double dblHour;
  int intDays;
  double dblRemainder;
  int intConvert;
  // get hours
  dblHour = readDouble("Enter the number of hours: ");
  
  intConvert = (int) dblHour;
  //convert to days
  intDays = intConvert / 24;
  dblRemainder = dblHour % 24;
  //print
  System.out.println("The number of days in " + dblHour + " is " + intDays + " days and " + dblRemainder + " hours.");

  }
}