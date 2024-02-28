class Hours extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    double dblDays;
    double dblHours;
    double dblMin;
    
//There are 60mins in 1hr.
//There are 1440mins in 1day

    dblMin = readDouble("Please enter the time in minutes to be converted to Days and Hours ");
   
    System.out.println("                                 ");

    dblHours = (dblMin / 60);
   
    dblDays = (dblMin / 1440);

      System.out.println("The time in minutes to days " + dblDays);
     
      System.out.println("                                 ");
     
      System.out.println("and hours is " + dblHours);
      
      System.out.println("                                 ");
       
      System.out.println("Thank you for using our Minute to Days & Hours Converter!");




  }
}