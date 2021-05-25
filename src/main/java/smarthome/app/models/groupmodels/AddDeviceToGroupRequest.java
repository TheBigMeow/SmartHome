package smarthome.app.models.groupmodels;

public class AddDeviceToGroupRequest {
    private int deviceId;
    private int groupId;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public AddDeviceToGroupRequest(int deviceId, int groupId) {
        this.deviceId = deviceId;
        this.groupId = groupId;
    }

    public AddDeviceToGroupRequest(){}
}
