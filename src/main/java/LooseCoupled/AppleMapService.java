package LooseCoupled;

public class AppleMapService implements GeoLocationService {
    @Override
    public String getCoordinates(String address) {
        return "AppleMap Coordinates";
    }
}
