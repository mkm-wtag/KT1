package SpringDI;

public class AppleMapService implements GeoLocationService {
    @Override
    public String getCoordinates(String address) {
        return "AppleMap Coordinates : 23.7778° N, 90.4057° E";
    }
}
