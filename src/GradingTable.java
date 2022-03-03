public class GradingTable {
    public static void main(String[] args) {
        int points = 100;
        System.out.println(getGrade(200));

        }
        public static String getGrade (int points) {
        String grade;
        if (points >= 90) {
            grade = "outstanding";
        }
        else if (points >= 78) {
            grade = "Excellent";
            }
        else if (points  >= 65) {
            grade= "acceptable";
            }
        else if (points >= 51) {
            grade = "Passing";
            }
        else {
            grade = "Fail";
            }
        return grade;

    }
}

