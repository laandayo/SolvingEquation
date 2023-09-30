import Controller.Algorithm;
import Controller.Validation;
import View.Menu;

public class Main {
    public static void main(String[] args) {
    Algorithm run = new Algorithm();
    String[] options = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
    Menu menu = new Menu("========= Equation Program =========", options) {
        @Override
        public void execute(int choice) {
            switch (choice) {
                case 1:
                    run.superlativeEquation();
                    break;
                case 2:
                    run.quadraticEquation();
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
            }
        }

    };
    menu.run ();
}
}