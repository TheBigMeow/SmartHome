package smarthome.app.models.groupmodels;

public class CreateGroupRequest {

    private String name;

    public String getName() {
        return name;
    }

    public CreateGroupRequest(){}

    public void setName(String name) {
        this.name = name;
    }

    public CreateGroupRequest(String name) {
        this.name = name;
    }
}
