class Cos3rd extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {
    
    // start coding here
    double dblSideA;
    double dblSideB;
    double dblAngleC;
    double dblSideC;

    dblSideA = readDouble("Please enter Side A: ");
    dblSideB = readDouble("Please enter side B: ");
    dblAngleC = readDouble("Please enter angle C: ");

    dblSideC = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2) - 2 * dblSideA * dblSideB * Math.cos(dblAngleC));

    System.out.println("The Length of Side C is: " + dblSideC);
//Great work!

    

  }
}