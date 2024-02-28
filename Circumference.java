class Circumference extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
      double dblCircum;
      double dblRad;

      dblRad = readDouble("Please enter the radius: ");


      dblCircum  = Math.PI * 2 * dblRad;

      System.out.println("The circumference of the circle is: " + dblCircum);
  }

}