package SpringDI;

public class GoogleMapService implements GeoLocationService {
    @Override
    public String getCoordinates(String address) {
        return "googleMap Coordinates : 23.7778° N, 90.4057° E";
    }
}
