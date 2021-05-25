package smarthome.app.models.groupmodels;

public class RemoveDeviceFromGroupRequest {

    private int groupId;
    private int deviceId;

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public RemoveDeviceFromGroupRequest(int groupId, int deviceId) {
        this.groupId = groupId;
        this.deviceId = deviceId;
    }

    public RemoveDeviceFromGroupRequest() {}
}
