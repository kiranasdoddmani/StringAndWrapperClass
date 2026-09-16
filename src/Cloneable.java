/*
  Cloneable :-

  Cloneable Sometimes We don't Want to Reference Pointing to SameObject ,We Want Seperate Copy
  Ex:-
  public class Cloneable {
    int id;
    String name;
    public static void main(String[] args) {

        Cloneable sc=new Cloneable();
        sc.id=2829;
        sc.name="Kirana s Doddamani";

        Cloneable sc2=sc;
        sc2.id=3310;
        System.out.println(sc.id);
        System.out.println(sc2.id);
  In This Example Sc Value is Copied to Sc2, if we try to assign Different Value but Both Varible points to sameValue
   Hence We Use Cloneable Concept

 */
public class Cloneable {
    int id;
    String name;
    public static void main(String[] args) {

        Cloneable sc=new Cloneable();
        sc.id=2829;
        sc.name="Kirana s Doddamani";

        Cloneable sc2=sc;
        sc2.id=3310;
        System.out.println(sc.id);
        System.out.println(sc2.id);


    }
}
