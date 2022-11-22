package mutAnimmut;
    public class mutable
    {
      private String s;
        mutable (String s)
        {
        this.s=s;
        }
        public String getName()
        {
        return s;
        }
        public void setName(String coursename)
        {
        this.s=coursename;
        }
        public static void main(String[]args)
        {
        mutable obj= new mutable("I Love Java");
        System.out.println(obj.getName());
        //Here,we can update the name using the setName method.
        obj.setName("Java Training 30Days Challeng"); 
               System.out.println(obj.getName());
    }
}
