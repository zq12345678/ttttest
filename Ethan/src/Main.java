import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double height = 1.67;
        double weight = 54.5;
        double BMI = weight / (height * height);
        System.out.println("The BMI is : "+BMI);
    }
}