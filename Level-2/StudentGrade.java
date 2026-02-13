import java.util.Random;
class StudentGrade{
    public static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = r.nextInt(90) + 10;
            marks[i][1] = r.nextInt(90) + 10;
            marks[i][2] = r.nextInt(90) + 10;
        }
        return marks;
    }
    public static double[][] calculateResults(int[][] marks) {
        double[][] result = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;
            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
        }
        return result;
    }
    public static char[] calculateGrades(double[][] result) {
        char[] grade = new char[result.length];
        for (int i = 0; i < result.length; i++) {
            double p = result[i][2];
            if (p >= 80) grade[i] = 'A';
            else if (p >= 70) grade[i] = 'B';
            else if (p >= 60) grade[i] = 'C';
            else if (p >= 50) grade[i] = 'D';
            else if (p >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }
        return grade;
    }
    public static void display(int[][] marks, double[][] result, char[] grade) {
        System.out.println("--------------------------------------------------------------------------");
        System.out.printf("%-8s %-8s %-10s %-8s %-8s %-10s %-12s %-6s\n",
                "Student", "Phy", "Chem", "Math", "Total", "Average", "Percent", "Grade");
        System.out.println("--------------------------------------------------------------------------");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d %-8d %-10d %-8d %-8.0f %-10.2f %-12.2f %-6c\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2],
                    grade[i]);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        int students = 5;
        int[][] marks = generateScores(students);
        double[][] result = calculateResults(marks);
        char[] grade = calculateGrades(result);
        display(marks, result, grade);
    }
}
