package smarthome.app.models;

public class DimLightRequest {

    private int id;
    private int dimValue;

    public DimLightRequest(int id, int dimValue) {
        this.id = id;
        this.dimValue = dimValue;
    }

    public  DimLightRequest() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDimValue() {
        return dimValue;
    }

    public void setDimValue(int dimValue) {
        this.dimValue = dimValue;
    }
}
