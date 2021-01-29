
/**
 * Die Klasse View wurde automatisch erstellt: 
 * 
 * @author 
 * @version 12.1.2021
 */
import java.util.*;
import java.util.stream.Collectors;
import sum.komponenten.*;
import sum.werkzeuge.*;
import sum.ereignis.*;

public class View extends EBAnwendung
{
    // Objekte
    private Knopf hatKnopfBubblesort;
    private Knopf hatKnopfSelectionsort;
    private Knopf hatKnopfInsertionsort;
    private Etikett hatEtikettOutput;
    private Textfeld hatTextfeldInput;
    
    private Parser hatParser;
    private SortAlg hatSA;
    List<Integer> zList;
    // Attribute

/**
 * Konstruktor
 */
    public View()
    {
        //Initialisierung der Oberklasse
        super(537, 172);

        hatKnopfBubblesort = new Knopf(23, 47, 100, 25, "Bubblesort");
        hatKnopfBubblesort.setzeBearbeiterGeklickt("hatKnopfBubblesortGeklickt");
        hatKnopfSelectionsort = new Knopf(23, 73, 100, 25, "Selectionsort");
        hatKnopfSelectionsort.setzeBearbeiterGeklickt("hatKnopfSelectionsortGeklickt");
        hatKnopfInsertionsort = new Knopf(23, 99, 100, 25, "Insertionsort");
        hatKnopfInsertionsort.setzeBearbeiterGeklickt("hatKnopfInsertionsortGeklickt");
        hatEtikettOutput = new Etikett(23, 125, 485, 25, "");
        // Ausrichtung
        hatEtikettOutput.setzeAusrichtung(Ausrichtung.LINKS);
        hatTextfeldInput = new Textfeld(23, 21, 491, 25, "");
        // Ausrichtung
        hatTextfeldInput.setzeAusrichtung(Ausrichtung.LINKS);
        
        hatTextfeldInput.setzeHinweis("Es können nur Zahlen eingegeben werden. Einzelne Zahlen müssen mit einem Leerzeichen getrennt werden.");
        
        hatParser = new Parser();
        hatSA = new SortAlg();
        zList = new ArrayList<Integer>();
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfBubblesort fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfBubblesortGeklickt()
    {        
        zList = hatParser.splitStringInTokens(hatTextfeldInput.inhaltAlsText());        
        zList = hatSA.bubbelsort(zList);        
        String lString = zList.toString();
        lString = lString.replaceAll("\\[","");
        lString = lString.replaceAll("\\]","");
        lString = lString.replaceAll("\\,","");
        hatEtikettOutput.setzeInhalt(lString);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfSelectionsort fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfSelectionsortGeklickt()
    {
        zList = hatParser.splitStringInTokens(hatTextfeldInput.inhaltAlsText());        
        zList = hatSA.selectionsort(zList);        
        String lString = zList.toString();
        lString = lString.replaceAll("\\[","");
        lString = lString.replaceAll("\\]","");
        lString = lString.replaceAll("\\,","");
        hatEtikettOutput.setzeInhalt(lString);
    }

/**
 * Vorher: Ereignis GeklicktvonhatKnopfInsertionsort fand statt.
 * Nachher: (schreiben Sie, was in dieser Methode ausgefuehrt wird)
 */
    public void hatKnopfInsertionsortGeklickt()
    {
        zList = hatParser.splitStringInTokens(hatTextfeldInput.inhaltAlsText());        
        zList = hatSA.insertionsort(zList);        
        String lString = zList.toString();
        lString = lString.replaceAll("\\[","");
        lString = lString.replaceAll("\\]","");
        lString = lString.replaceAll("\\,","");
        hatEtikettOutput.setzeInhalt(lString);
    }

}
