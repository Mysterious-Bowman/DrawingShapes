public class Shapes {
    Turtle turts = new Turtle();
    double sides = 100;
    double turns = 128;
    double numCircle = 1.00001;
    
    public void main(String[] args) {
        // Task 1: Draw a regular shape
        /*for (int i = 0; i < 5; i++) {
            turts.forward(50);
            turts.left(70);
        }*/

        // Task 2: Draw a regular shape many times
        //turts.left(180);
        //turts.forward(250);
        //turts.right(180);
        
        turts.penColor("Red");
        turts.speed(5);
        
        for (int j = 0; j < turns; j++) {  
            turts.right((double)(360*numCircle)/turns);
        
              
            for (int i = 0; i < sides; i++) {
               turts.forward(50 + turns);
               turts.right(180-((double)(((sides-2)*180)/sides)));
            }
        }
//F\left(x\right)=\frac{\left(\left(x-2\right)180\right)}{x}
        // Task 3: How many times does Turtle turn!


        // Extension 1:


        // Extension 2:

    }
}
