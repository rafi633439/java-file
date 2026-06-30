public class Prac1 {
    
public static int id = 500;
public static String name;

public static void print(){
    System.out.println("--------print-------");
     System.out.println("ID:"+id);
      System.out.println("Name:"+name);
}

public static String display(){
    System.out.println("--------display-------");
     System.out.println("ID:"+id);
      System.out.println("Name:"+name);
      return "Hello-----";
}
public static String display2(int id,String name){
    System.out.println("--------display2-------");
     System.out.println("ID:"+id);
      System.out.println("Name:"+name);
      return "Hello " + name;
}
public static Integer calculate(){
    System.out.println("--------calculate-------");
     int a = 20;
     int b = 30;
     return a+b;

}
public static Integer calculate2(int a ,int b){
    System.out.println("--------calculate2-------");

     return a+b;
     }
public static void main(String[] args) {
  
   print();

String s = display();
System.out.println(s);

int c = calculate(); 
System.out.println(c);
System.out.println(50+c+20);

String s2= display2(100,"Rafi"); 
System.out.println(s2);

int s3= calculate2(100,500); 
System.out.println(s3);
 s3= calculate2(100,100); 
System.out.println(s3);
 s3= calculate2(300,500); 
System.out.println(s3);

int s4 = calculate2(100,500); 
System.out.println(s4);
 s4 += calculate2(100,100); 
System.out.println(s4);
 s4 += calculate2(300,500); 
System.out.println(s4);




}


}
