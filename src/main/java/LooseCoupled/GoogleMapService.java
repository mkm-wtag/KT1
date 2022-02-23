package LooseCoupled;

public class GoogleMapService implements GeoLocationService {
    @Override
    public String getCoordinates(String address) {
        return "googleMap Coordinates";
    }

}
