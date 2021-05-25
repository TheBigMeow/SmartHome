package smarthome.app.models;

public class DeviceIdRequest {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeviceIdRequest(int id) {
        this.id = id;
    }
    public DeviceIdRequest() {}
    private int id;
}
