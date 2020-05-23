object q2{

    def main(args:Array[String]){

         var value= volspehre(5);
         println("Volume of sphere is "+value);
      }

     def volspehre(r:Int):Double={
              
         var R=scala.math.pow(r,3);
         var volume=(4/3)*(22/7)*R;
         return volume;

     }

}