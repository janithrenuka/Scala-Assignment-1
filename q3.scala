object q3{

     def main(args:Array[String]){

            var total=totalCost(60);
            
            println("Total cost: "+ total );


      }
      
       def totalCost(copies:Int):Double={

               var price=24.95;
                //check whether count of copies are greater than 50 or not
               if(copies>=50)
                     {
                      var total= price*copies*0.6 + 50*3 + (copies - 50)*0.75 ;
                      return total;
                      } 
        
               else
                   {
                    var total= price*copies*0.6 + copies*3;
                    return total;

                   }        
                

         }

}