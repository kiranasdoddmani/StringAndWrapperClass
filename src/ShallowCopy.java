import java.lang.Cloneable;

/*
    ShallowCopy and DeepCopy
 */
public class ShallowCopy implements Cloneable {
        int id;
      //  String name;
        Address address;

       public ShallowCopy(int id,Address address){
        this.id=id;
      //  this.name=name;
           this.address= address;
       }

//       ShallowCopy
//       @Override
//      public Object clone() throws CloneNotSupportedException{
//           return  super.clone();
//      }


    //      DeepCopy
           @Override
          public Object clone() throws CloneNotSupportedException{
               ShallowCopy cloned=(ShallowCopy) super.clone();
                cloned.address=new Address(this.address.city);
                return cloned;
          }

      static class Address{
           String city;

           Address(String city){
               this.city=city;
           }
      }

    public static void main(String[] args) throws CloneNotSupportedException {

        Address address=new Address("Pune");

//        ShallowCopy sc=new ShallowCopy(2829,"Kirana");

        ShallowCopy sc=new ShallowCopy(2829,address);
        ShallowCopy sc2= (ShallowCopy) sc.clone();

//         System.out.println(sc.name);
//          System.out.println(sc2.name);
//
//          sc2.name="AnuKirana";
//
//        System.out.println(sc.name);
//        System.out.println(sc2.name);


         System.out.println(sc.address.city);
          System.out.println(sc2.address.city);

          sc2.address.city="Delhi";

        System.out.println(sc.address.city);
        System.out.println(sc2.address.city);

    }
}
