package Model;

import ModelInterpreter.HelpfulMethods;

public class BegegnungsDaten {



    private RegionErgebnis region;
    private LocationErgebnis location;
    private BegegnungResult begegnung;

    public BegegnungsDaten(RegionErgebnis region, LocationErgebnis location, BegegnungResult begegnung) {
        this.region = region;
        this.location = location;
        this.begegnung = begegnung;


    }

    public RegionErgebnis getRegion() {
        return region;
    }

    public void setRegion(RegionErgebnis region) {
        this.region = region;
    }

    public LocationErgebnis getLocation() {
        return location;
    }

    public void setLocation(LocationErgebnis location) {
        this.location = location;
    }

    public BegegnungResult getBegegnung() {
        return begegnung;
    }

    public void setBegegnung(BegegnungResult begegnung) {
        this.begegnung = begegnung;
    }


    @Override
    public String toString(){

        return "In "+HelpfulMethods.capitalizeFirst(region.getName())+ ": "+ HelpfulMethods.capitalizeFirst(location.getName());


    }
}
