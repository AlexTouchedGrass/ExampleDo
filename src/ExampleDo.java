import java.util.Scanner;

public class ExampleDo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1 = "Alex";
        String name2 = "Gorg";
        String name3 = "Bob";

        int ageAlex = 17;
        int ageGorg = 29;
        int ageBob = 69;

        String colorAlex = "Red";
        String colorGorg = "Red";
        String colorBob = "Blue";

        System.out.printf("%-10s%5s%7s" , "Name" , "Age" , "Color");
        System.out.printf("\n%-10s%5d%10s", name1, ageAlex, colorAlex);
        System.out.printf("\n%-10s%5d%10s", name2, ageGorg, colorGorg);
        System.out.printf("\n%-10s%5d%10s", name3, ageBob, colorBob);





    }
}