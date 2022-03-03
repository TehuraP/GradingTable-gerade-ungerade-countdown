public class GradingTableSwitch {
    public static void main(String[] args) {
        System.out.println(getGradeText(5));
        System.out.println(getGradeText(4));
        System.out.println(getGradeText(3));
        System.out.println(getGradeText(2));
        System.out.println(getGradeText(1));
        System.out.println(getGradeText(0));
        System.out.println(getGradeText(-1));
        System.out.println(getGrade("outstanding"));
    }
    public static String getGradeText (int grade) {
        String gradeText;
        return switch (grade) {
            case 1 ->  "outstanding";
            case 2 ->  "excellent";
            case 3 -> "acceptable";
            case 4 -> "passing";
            case 5 ->  "fail";
            default ->  null;
        };

    }
    public static  int getGrade (String gradeText) {
        return switch (gradeText){
            case "outstanding" -> 1;
            case "excellent" -> 2;
            case "acceptable" -> 3;
            case "passing"-> 4;
            case "fail" -> 5;
            default -> 0;
        };
    }
}
