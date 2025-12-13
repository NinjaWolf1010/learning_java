public class strings_try {
    public static void main(String[] args){
        String greeting = "Pranav";
        System.out.println(greeting.length());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); 
        System.out.println("The letter a in Pranav "+ greeting.indexOf("a"));
        System.out.println("Letter at index pos 4 is "+ greeting.charAt(4));

        String text1 = "Hello";
        String text2 = " Hello ";
        boolean check_equal = text1.equals(text2);
        System.out.println(check_equal);
        String concatenation = text1 + text2.trim();
        String concatenation_1 = text1.concat(text2);
        System.out.println(concatenation_1); 
}
}
