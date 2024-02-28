class FtoC extends ConsoleProgram {

  /**
  * Description
  * @author: Gabriel Jaja
  */
  
  public void run() {
    
    // start coding here
      double dblCel;
      double dblFht;
      

      dblFht = readDouble("Please enter a degree measure in Fahrenheit ");

      dblCel = 5.0 / 9.0 * (dblFht - 32);


      System.out.println("The Temperature in Celcius is degrees " + dblCel);




  }
}