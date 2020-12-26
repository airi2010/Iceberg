package iceberg_track;

import java.time.LocalDate;

public class IcebergData {
    private final LocalDate date;
    private final Iceberg iceberg;
    private final String coordinates;
    private final double volume;

    public IcebergData(LocalDate date, Iceberg iceberg, String coordinates, double volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.coordinates = coordinates;
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return iceberg + " El: " + date
                + ", su volumen es: " + volume 
                + ", y sus cooordenadas son: " + coordinates;
    }
    
}
