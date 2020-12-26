
package iceberg_track;


import java.time.LocalDate;
import java.time.Month;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Iceberg_track {
    MultiValuedMap<Iceberg,IcebergData> mapa = new ArrayListValuedHashMap<>();
    
    public static void main(String[] args) {
        Iceberg_track icebergTracker = new Iceberg_track();
        icebergTracker.output();
    }

    public Iceberg_track() { 
        Iceberg iceberg1 = new Iceberg(1, "Polo Norte", LocalDate.of(2017, Month.MARCH, 1));
        Iceberg iceberg2 = new Iceberg(2, "Polo Sur", LocalDate.of(2017, Month.MARCH, 10));;
        
        mapa.put(iceberg1, new IcebergData(LocalDate.of(2019, Month.MARCH, 8), 
                iceberg1, "81º N 7' E", 9e9));
        mapa.put(iceberg1, new IcebergData(LocalDate.of(2019, Month.JANUARY, 6), 
                iceberg1, "81º N 9' E", 8e9));
        mapa.put(iceberg2, new IcebergData(LocalDate.of(2010, Month.FEBRUARY, 3), 
                iceberg2, "70º S 15' W", 7e9));
        mapa.put(iceberg2, new IcebergData(LocalDate.of(2010, Month.MARCH, 29), 
                iceberg2, "69º S 31' W", 6e9));
    }
    
    private void output() {
        for (IcebergData d : mapa.values()) {
            System.out.println(d);
        }
    }
    
}
