import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

class tri {
  public static void main(final String[] args) {
    
    ArrayList<String> nom = new ArrayList<String>();
      nom.add("Toto");
      nom.add("Titi");
      nom.add("Tutu");
      nom.add("Toto");
      nom.add("Tata");
      nom.add("Titi");
      nom.add("Tete");
      nom.add("Toto");
      nom.add("Titi");
      Collections.sort(nom);

      Set<String> triernom = new HashSet<String>(nom);

      System.out.println(triernom);
  }
}