class Minutes extends ConsoleProgram {

  /**
  * turns minutes to days hours minutes 
  * @author: Ryan Ip
  */
  
  public void run() {
    // variables
  
  int intMinute;
  int intHour;
  int intConvertHours;
  int intDays;
  int intRemainderHours; 
  int intRemainderMinutes;
  // get hours
  intMinute = readInt("Enter the number of minutes: ");

  //convert to days hours 
  intDays = intMinute / 1440;
  intRemainderHours = intMinute % 1440;
  intHour = intRemainderHours / 60;
  intRemainderMinutes = intRemainderHours % 60;
  
  //print
  System.out.println("The number of days, hours, and minutes in " + intMinute + " minutes is " + intDays + " days, " + intHour + " hours, and " + intRemainderMinutes + " minutes." );

    
  }
}