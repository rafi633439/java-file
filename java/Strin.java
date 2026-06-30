public class Strin {
    public static void main(String[] args) {
      
        
// String literal = memory location same.

String a ="abc";
String b ="abc";

// String object = memory location different.

String c = new String("abc");
String d = new String("abc");

// == vs equals (== check the memory location but .equals CHECK THE VALUE ) 

System.out.println(a==b);
System.out.println(a==c);
System.out.println(c==d);
System.out.println(a.equals(c));
System.out.println(c.equals(d));

// Length = count the number of character.(space is also a character)
 String text ="Java Programming";
 System.out.println(text.length());

// charAt = give the character name 
System.out.println(text.charAt(2));

// toUpperCase = give the capital letter
System.out.println(text.toUpperCase());

// toLowerCase = give the small letter
System.out.println(text.toLowerCase());

// contains = if get the word /character ,it will give true.otherwise false.
System.out.println(text.contains("Java"));
System.out.println(text.contains("java")); //case-sensitive.
System.out.println(text.contains("va"));
System.out.println(text.contains("gram"));
System.out.println(text.contains("c++"));

// startsWith = check the first word or character
System.out.println(text.startsWith("Java"));
System.out.println(text.startsWith("ja")); //case-sensitive
System.out.println(text.startsWith("Ja"));

// endsWith = check the last word / character (spelling must be true)
System.out.println(text.endsWith("va"));
System.out.println(text.endsWith("ing"));
System.out.println(text.endsWith("graming"));
System.out.println(text.endsWith("gramming"));

//indexOf = give tha cgaracter index number.if character more than one ,it will give the first.
System.out.println(text.indexOf("p")); //case sensitive
System.out.println(text.indexOf("P"));
System.out.println(text.indexOf("a"));

// lastIndexOf = give last index number of a character
System.out.println(text.lastIndexOf("a"));

// substring = cut the character from a text(first index number,until previous number of the last index number)
System.out.println(text.substring(0,3));

// replace = change the text permanently.
System.out.println(text.replace("Java","Javascript"));

// trim = remove the first and last spaces

String abc ="       Rafi     ";
System.out.println(abc.trim());

// isEmpty = if the value is empty ,it give true.otherwise give false.

String empty = "";
System.out.println(empty.isEmpty());
String emp = " ";
System.out.println(emp.isEmpty()); // space is a character.
String em = "a";
System.out.println(em.isEmpty());

// isBlank = if there has some value ,it give true .Here empty and space give the false.

String bl = "";
System.out.println(empty.isBlank());
String bla = " ";
System.out.println(emp.isBlank()); // Here space is not a character.
String blank = "a";
System.out.println(em.isBlank());

// concat = add two value / character / word.  
String x = "Hello";
System.out.println(x.concat(" Rafi"));

// equalsIgnoreCase = ignore the case.
String y="Rafi";
System.out.println(y.equalsIgnoreCase("rafi"));

// equals = check the case.
System.out.println(y.equals("rafi"));

// split
String xyz = "Java,Spring,Angular,Oracle";

String[] skills = xyz.split(",");
for (String skill : skills){System.out.println(skill);}

// join
String z = String.join("-",skills);
System.out.println(z);

// repeat

String val = "*";
System.out.println(val.repeat(5));




    }
}
