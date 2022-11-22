package MethodsOverloadOverride;

class Beast
{  
  //defining a method  
  void run()
     {
         System.out.println("Vehicle is moving");
     }  
}  
            //Creating a child class  
           class C2 extends Beast
     {  
            //defining the same method as in the parent class  
            void run(){System.out.println("Vehicle is Moving safely");}  
        
        
       

        public static void main(String args[]){  
        C2 obj = new C2();
        //creating object  
        obj.run();
        //calling method  
        }  

        }
