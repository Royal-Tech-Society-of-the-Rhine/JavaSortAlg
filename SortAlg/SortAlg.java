import java.util.*;
/**
 * Beschreiben Sie hier die Klasse SortAlg.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class SortAlg
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    

    /**
     * Konstruktor für Objekte der Klasse SortAlg
     */
    public SortAlg()
    {
        
    }

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    
    public List<Integer> bubbelsort(List<Integer> pList)
    {
        List<Integer> lList = pList;
        for(int n = lList.size(); n>1; n--)
        {
            for(int i = 0; i<n-1; i++)
            {
                if(lList.get(i) > lList.get(i+1))
                {
                    Collections.swap(lList, i, i+1);
                }
            }
        }
        return lList;
    }
    //untested
    public List<Integer> selectionsort(List<Integer> pList)
    {
        List<Integer> lListU = pList;
        List<Integer> lListS = new ArrayList<Integer>();
        int lP = 0;
        int lT = 0;
        for(int n = lListU.size(); n>0; n--) 
        {
            for(int i = 0; n>i; i++)
            {
                if(lListU.get(i) > lP)
                {
                    lT = i;
                    lP = lListU.get(lT);
                }
            }
            lP = 0;
            lListS.add(0, lListU.remove(lT));            
        }
        return lListS;
    }
    
    
    
    //von OldCurmudgeon https://stackoverflow.com/questions/13766209/effective-swapping-of-elements-of-an-array-in-java
    private static final <T> void swap (T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
