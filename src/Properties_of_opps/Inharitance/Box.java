package Properties_of_opps.Inharitance;


public class Box {

    double l;
   double h;
   double w;
   private double g;

   Box(){
       this.l = 10;
       this.h = 20;
       this.w = 40;
       this.g = 20;

   }
   Box(double side){
       super();
       this.h = side;
       this.w = side;
       this.l = side;
       this.g = side;
   }
   Box(Box old){
       this.h = old.h;
       this.w = old.w;
       this.l = old.l;
       this.g = old.g;
   }
   Box(double h , double l , double w , double g){
       this.h = h;
       this.w = l;
       this.l = w;
       this.g = g;
   }
   public void information(){
        System.out.println("Box is running ");
    }
}
