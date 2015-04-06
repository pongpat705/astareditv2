/**
 * Created by pongpat705 on 4/1/2015.
 */
public class Station {
    private String stations;
    private Double lat;
    private Double lng;

    public Station(String stations, Double lat, Double lng){
        this.stations = stations;
        this.lat = lat;
        this.lng = lng;
    }


    public String getStations(){
        return this.stations;
    }

    public Double getLat(){
        return this.lat;
    }

    public Double getLng(){
        return this.lng;
    }

}