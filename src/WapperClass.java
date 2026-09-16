/*
WrappeClass :-
   WapperClass are Used in Collection FrameWork
    CollectionFrameWork Means it's Store an Objects not DataType Like int,char etc..
 WrapperClass Like Integer,Character and String Boolean

 Collection Menas it can Store Both Homogenous and Heterogeneous
 Collection Can Be Implemented By Some Standard-Class Means Every Class will Have some Predefined Capability
   Like ArrayList,LinkedList etc..

   Why Do We Use WrapperClass :-
     Collection canStore the Objects not Primitive ,Wrapperclass Provide a Usefull Methods,It can Store Null,
     Wrapper Class is usefull in Generics

       ArrayList<Integer> list=new ArrayList<>();
          <Integer> -> It is Combination of Both generics <> and WrapperClass [Integer]

 In WrapperClass We Use Boxing and UnBoxing Concepts
  Boxing (Manual):-
     Boxing Means Converting Primitive DataType to WrapperObject
     Syntax :-
       Integer n1=100;
        Integer number=Integer.valueof(n1);
     n1 value will store in memory in the form of object

   Unboxing :-
       Unboxing Means The 100 value is Stored in the form of object,these Object will be Converted into Primitive in
         the form of UnBoxing
      Syntax:-
        Integer number=Integer.valueof(100);
         int num=number.intvalue(number);

    Auto Boxing :-
      Auto Boxing Means Jvm is automatically convert into Primitive
       We don't need to write a code Like [Integer num=Integer.valueof(100);]

    String Conversion:-
      In We Use ParseInt()
        String age="21";
         int num=Integer.ParseInt(age);
         System.out.println(num);

    // Compare :-
      Which is used to Comapre the Two values
         Integer.compare(num1,num2);
          num1<num2 -> -1
          num1=num2 -> 0
          num1>num2 -> 1

      compare(a,b);  -> Compare two Values
      max(a,b);      -> return max
      min(a,b);      -> return min
      toString(value);   -> Convert valuetoString

     Comapre Bit :-

     Integer a=100;
     Integer b=100;
     System.out.println(a==b);    o/p:-true

     System.out.println(Integer.compare(a,b));   o/p:- 0

     System.out.println(a1.equals(b1));  --> true
      .equals is an Method it only value bcz the two value is stored in same object
        .equals is only for Applied for WrapperClass not Primitive Datatypes

       == it show

     Integer a1=200;
        Integer b1=200;
        System.out.println(a1==b1);   o/p:- false

        Why False Bcz of it's Value
    Integer Have Bits Range B/W -128 to +127
       if The Value is Comapre Out of This Range Hence it's Show False
       if The Value is in Range B/W -128 to +127 Hence it's Show True


// String :- String is a Sequence of Character
     String is Immutable,String is a Class in Java Which is Used to Store the Texts
   Real-time Application :-
    Username,Password,email,MobileNumber,API URL,Sql Query,JSON Message,File Path,Request Parameter

 If once String is Created It's Content Can't be Modified

      In String We Use StringBuilder and StringBuffer
       StringBuilder and StringBuffer is Important when text Chanages Repeatedl hence We can Use The StringBuilder and
         String Buffer ,Mainly Used is StringBuffer

       String Methods Like :-
        to.uppercase(); to.lowercase(); trim(); length(); charAt();

     String Constant Pool :-
       Scp is a SpecialMemoryArea Which Java Store String Literals

   Why we Use SCP :-
    To Reuse The Same Text and Same Memory,When Ever We are Trying to Create a Object with Literals Objects will
      be created Inside The SCP

      String s1="Java";
      String s2="Java";
      String s3="Raju";
       s1,s2 and s3 are Stored in SCP Memory
        s1,s2 are Both are Pointing to the Same Object

   InCase if we use New Keyword then the Object will be Stored in a Heap Area not SCP,if the Object value is Same
     jvm will create a new memory in HeapArea and stored that value
      SCP is Present inside The HeapArea

      String s1="Java";
      String s2="Java";
      String s4=new String("java");

      System.out.println(s1==s2);
      System.out.println(s1==s3)
      System.out.println(s1.equals(s3));

    // Split Methods Means is Used to break a String into Multiple Parts Based on Separator
          names.split(" ");

    // StringBuilder :-
       StringBuilder is an Mutable Class used for Modify the Text
        Methods :-
         append(); Replace(); length(); insert(); reverse(); toString(); delete(); capacity();
         Syntax:-
         StringBuilder sc=new StringBuilder("Java");
               sb.append("Backed");
               sb.append("Course");
               System.out.println(sc.toString());
               System.out.println(sc.length());
               System.out.println(sc.capacity());
               s.insert(5,"Java");

      sc.capacity() -> In StringBuilder Default Value of Capacity is 16

         To Calculate the Capacity :-
          Formula=oldCapacity*lengthofString+2;

      StringBuffer :-
       StringBuffer is also Mutuable like StringBuilder and StringBuffer is an Thread Safe
         Thread-Safe Means MultiThread can Use the SameObject Without Corrupting InternalData

      * StringBuffer is an Synchronized Methods
 */

import java.util.ArrayList;

public class WapperClass {
    public static void main(String[] args) {
//        // WrapperClass
//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        for(int i=0;i< list.size();i++){
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println();
//
//        // String Conversion
//        String age="21";
//        int num=Integer.parseInt(age);
//        System.out.println(num);
//
//        // Boxing
//        Integer n1=100;
//        int number=Integer.valueOf(n1);
//        System.out.println(number);

//        // Unboxing
//        Integer obj=Integer.valueOf(101);
//        int str=obj.intValue();
//        System.out.println(str);
//
//        // Auto Boxing
//        Integer val=2829;
//        System.out.println(val);

//        Integer a=100;
//        Integer b=100;
//        System.out.println(a==b);

//        System.out.println(Integer.compare(a,b));
//
//        Integer a1=150;
//        Integer b1=150;
//        System.out.println(a1==b1);

//        System.out.println(a1.equals(b1));  // true

//        Integer a=500;
//        Integer b=500;
//        System.out.println(a==b);         // -> false bcz of it's range
//        System.out.println(a.equals(b));  // -> true  bcz .equals is only see value bcz those value is store in same object
//
//        Integer a1=100;
//        Integer b1=100;
//        System.out.println(a1==b1);       // -> true  bcz of it's range
//        System.out.println(a1.equals(b1)); // -> true


//        String s1="Java";
//        String s2="Java";
//        String s3=new String("java");
//
//        System.out.println(s1==s2);
//        System.out.println(s1==s3);
//        System.out.println(s1.equals(s3));
//
//        String name="Kirana";
//       System.out.println(name.concat(" is an Java Full Stack-Backend Developer"));

       // Split Method
//        String name="Kirana is an Java-Backend Developer";
//        String names[]=name.split(" ");
//         for(String str : names){
//             System.out.println(str);
//         }

    // StringBuilder

        StringBuilder sc=new StringBuilder("Java");
        sc.append(" Backend ");
        sc.append("Course");
        System.out.println(sc.toString());
        System.out.println(sc.length());
        System.out.println(sc.capacity());
        sc.insert(12,"Full-Stack");
        System.out.println(sc.toString());
        System.out.println(sc.capacity());
         }
    }

