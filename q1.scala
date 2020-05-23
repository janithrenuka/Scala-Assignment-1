object q1{

     def main(args:Array[String]){
 
            //celsius 35
            var value= convert(35);
            println("F :" + value);
 
       }
    def convert(C:Int):Double={
            
              var F= C*1.8 + 32.0;
               return F;
        }


}