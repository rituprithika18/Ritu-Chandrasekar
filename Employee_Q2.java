public class Employee_Q2
{
    double salary1;
    String name_of_employee;
    double final_amt;
   
    void init(double  salary, String name_of_employee1 )
    {
         salary1= salary ;
         name_of_employee = name_of_employee1;
    }
    double calc ()
    {
        final_amt = salary1+((50.0/100.0)*salary1);
        return final_amt; //caller
    }
    String we()
    
    {
        String name1= name_of_employee;
        return name1;
    }
     public static void main()
     {
      Employee_Q2 obj = new Employee_Q2();
      obj.init(100000,"Ritu");
      double  final_amt = obj.calc();
      String name1 = obj.we();
      System.out.println(final_amt);
      System.out.println(name1);
    
    }
}

        
        