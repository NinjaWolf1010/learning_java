public class calc_percentage {
    public static void main(String[] args){
        int max_score = 1500;
        int player_score = 200;
        double percentage = ((double) player_score/ (double)max_score) * 100.0d;
        System.out.println(percentage);
    }
}
