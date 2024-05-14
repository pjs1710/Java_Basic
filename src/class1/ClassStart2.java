package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] std = {"학생1", "학생2"};
        int[] age = {15, 16};
        int[] score = {90, 80};

        for (int i = 0; i < std.length; i++) {
            System.out.println("이름: " + std[i]+ " 나이: " + age[i] + " 성적: " + score[i]);
        }
    }
}
