package LooseCoupled;

public class Runner {
    public static void main(String[] args) {
        Service service = new Service();
        service.setGeoLocationService(new GoogleMapService());
        System.out.println(service.getGeoLocationService().getCoordinates("fg"));
    }
}
