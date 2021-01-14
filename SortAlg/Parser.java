//von RPN Projekt
import java.util.*;
/**
 * @author 
 * @version 
 */
public class Parser
{
    // Bezugsobjekte

    // Attribute

    // Konstruktor
    public Parser()
    {
        

    }

    // Dienste
    public List<Integer> splitStringInTokens(String pString)
    {
//         for(int i = 0, n = pString.charAt(i) ; n != ' '  ; i++) { 
//             char c = pString.charAt(i); 
//         }
        String lString = pString.replaceAll("\\+"," + ");
        lString = lString.replaceAll("\\-"," - ");
        lString = lString.replaceAll("\\/"," / ");
        lString = lString.replaceAll("\\*"," * ");
        lString = lString.replaceAll("\\("," ( ");
        lString = lString.replaceAll("\\)"," ) ");
        Scanner scanner = new Scanner(lString);
        List<Integer> lA = new ArrayList<Integer>();
        while (scanner.hasNextInt()) 
        {
            lA.add(scanner.nextInt());
        }

//         String lString = pString.replaceAll("\\W"," \\W ");
        
        String lString2 = lString.trim().replaceAll(" +", " ");
        //List<Integer> lA = Arrays.asList(lString2.split(" "));
        return lA;
    }
}
