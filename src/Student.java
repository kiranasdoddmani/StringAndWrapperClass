import java.lang.Cloneable;

/*
     Cloneable :-
        Cloneable Interface will Throw SomeException While Creating
         Cloneable Interfave is MarkerInterface ,It Can be Achived by Implementing Cloneable

         Cloneable Which Override the SomeMethods ByDefault

           System.out.println(sc==sc2); --> Show false
             True if Both Value is on SameObject
            it Show false BCZ Each Value will Created Their Own Object

       // Two Types of Clone
         1. Shallow Copy
         2. Deep Copy

       Shallow copy = new outer object + same inner objects.
       Deep copy = new outer object + new inner objects.


    */
public class Student implements Cloneable {
    int id;
    String name;

    public Student(int id,String name) {
        this.id = id;
        this.name=name;
    }

  // Overide-Methods
  public Object clone() throws CloneNotSupportedException{
        return super.clone();
  }

   public static void main(String[] args) throws CloneNotSupportedException {

        Student sc=new Student(101,"Kirana");
         Student sc2= (Student) sc.clone();

          sc2.id=102;
          sc2.name="Anu";

         System.out.println(sc.id+" "+sc.name);

         System.out.println(sc2.id+" "+sc2.name);

         System.out.println(sc==sc2);
    }
}
