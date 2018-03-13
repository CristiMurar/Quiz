import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-Rectangle. 2-Square. 3-Circle. 4-Triangle");
        int select = Integer.parseInt(scanner.next());

        if (select == 1) {
            System.out.println("Please enter the length of the rectangle: ");
            double length = Integer.parseInt(scanner.next());
            System.out.println("Please enter the width of the rectangle: ");
            double width = Integer.parseInt(scanner.next());
            Rectangle rectangle = new Rectangle();
            double area = rectangle.rectangleCalc();
            System.out.println(area);

        }
            else if (select == 2) {
            System.out.println("Please enter the width of the square: ");
            int width = Integer.parseInt(scanner.next());1

// total fail !!!  Va fi mai bine la urmatorul
    }
    }
}