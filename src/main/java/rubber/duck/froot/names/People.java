package rubber.duck.froot.names;

import java.util.Random;
import rubber.duck.froot.Froot;

/**
 *
 * @author Peter C
 */
public class People implements Froot {
    
    private final String[] firstNames = {"Ned","Frasier","Homer","Jimbo", "Pedro", "Omar", "Loz", "Kag", "Sazzle", "Luke", "Svendall", "Stinky", "Theo", "Jack", "Ads", "Emily", "Emmy", "Laura", "Gretchen", "Olivia", "Jesus", "Franklin", "Murdoch", "Morgan", "Deb", "Allison", "Alistair", "Montgomery", "Matthias", "Frederica", "Anna", "Cletus"};
    private final String[] givenNames = {"Gruyere","Spink","White","Cartman", "Sherman", "Mandanda", "Fork", "Kellogg", "Chrisp", "Perch", "Salmon", "Maggle", "Fretus", "Kripke", "Portland", "Tillerman", "Hernandez", "Wilshere", "Wild", "Mantis", "Kelly", "Dexter", "Crapster", "Harrington", "Aston", "Bond", "Grey", "Bauer"};
    private final Random random = new Random();

    @Override
    public String random() {
        int first = random.nextInt(firstNames.length);
        int second = random.nextInt(givenNames.length);
        return firstNames[first] + " " + givenNames[second];
    }
}
