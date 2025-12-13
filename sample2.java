public class sample2 {
    public static void main(String[] args){
        boolean man = true;
        boolean citizen = true;
        int age = 25;
        if(man && citizen && age>18){
            System.out.println("Eligible to vote");
        }
        else if(man && citizen){
            System.out.println("Take voter id");
        }
    }
}
