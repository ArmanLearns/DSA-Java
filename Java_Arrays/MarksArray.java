import java.util.Scanner;

class MarksArray {
    public static void main(String[] args) {
        int[] marks = new int[100];        // over-allocated; could use new int[3] since we only need 3
        Scanner sc = new Scanner(System.in);

        // Read marks for 3 subjects
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy:   " + marks[0]);
        System.out.println("chem:  " + marks[1]);
        System.out.println("maths: " + marks[2]);

        // Average — use double to avoid integer division truncation
        double percentage = (marks[0] + marks[1] + marks[2]) / 3.0;
        System.out.println("percentage: " + percentage);

        // Arrays are mutable — you can update an element after assigning it
        marks[2] = marks[2] + 1;
        System.out.println("maths (updated): " + marks[2]);

        sc.close();   // close the Scanner when done

        // Time Complexity: O(1) — fixed number of operations, no loops
    }
}