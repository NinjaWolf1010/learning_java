public class sample1 {
    public static void main(String[] args){
    int num = 10;
    String name = "Pranav";
    final float pi = 3.1415f;
    boolean isjavafun = true;
    var x = 25; //Automatically assigns datatypes
    int narrow_type_casting = (int) pi;  //To reduce a larger size datatype to a smaller size , viceversa is done automatically
    System.out.println(narrow_type_casting);
    System.out.println(pi * x);
    System.out.println("Number is "+num+" and name is "+name);
    System.out.println(!isjavafun);
    System.out.println("This is my first java program");
    System.out.println(3*3);
}
}
