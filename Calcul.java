import java.util.Scanner;

class Calcul {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Calculator calc = new Calculator(sc);
    calc.run();

    sc.close();
  }
}

class Calculator {  
  private Scanner sc;
  private int nb1 = 0, nb2 = 0;
  private String operation = "";
  private String question = "";

  Calculator(Scanner pScanner) {
    this.sc = pScanner;
  }

  public void run() {
    mainLoop: while (!question.equals("non")) {
      System.out.println("Calculatrice");
  
      try {
        System.out.print("1er nombre: ");
        nb1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Type d'opération [+-/*%]: ");
        operation = sc.next();
        sc.nextLine();
        
        System.out.print("2ème nombre: ");
        nb2 = sc.nextInt();
        sc.nextLine();

        int result = 0;
        switch (operation) {
          case "+":
            result = nb1 + nb2;
            break;
          case "-":
            result = nb1 - nb2;
            break;
          case "/":
            result = nb1 / nb2;
            break;
          case "*":
            result = nb1 * nb2;
            break;
          case "%":
            result = nb1 % nb2;
            break;
          default:
            System.out.println("Calcul imposssible !");
            continue mainLoop;
        }
        
        System.out.println("Résultat de l'opération: " + result);
        
        System.out.println("\nVoulez-vous recommencer ? (oui/non)");
        question = sc.nextLine();
      }
      catch (Exception exception) {
        if (sc.hasNextLine()) {
          sc.nextLine();
        }
      }
    }
    
    // FINAL CODE
    System.out.println("Calculatrice Fermée! Merci de l'utilisation! ");
    sc.close();
  }
}