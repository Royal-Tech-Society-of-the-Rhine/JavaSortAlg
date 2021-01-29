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
        
        String lString = pString;
        //lString = lString.replaceAll("\\-"," - ");
        
        lString = lString.replaceAll("\\,"," ");
        lString = lString.replaceAll("\\;"," ");
        lString = lString.replaceAll("\\/"," ");
        lString = lString.replaceAll("\\-"," ");
        lString = lString.replaceAll("\\_"," ");
        
        Scanner scanner = new Scanner(lString);
        
        List<Integer> lA = new ArrayList<Integer>();
        while (scanner.hasNextInt()) 
        {
            lA.add(scanner.nextInt());
        }


        return lA;
    }
}
