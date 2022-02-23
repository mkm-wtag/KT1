package SpringDI;

public class Service {
    private GeoLocationService service;

    public GeoLocationService getService() {
        return service;
    }

    public void setService(GeoLocationService service) {
        this.service = service;
    }
}
