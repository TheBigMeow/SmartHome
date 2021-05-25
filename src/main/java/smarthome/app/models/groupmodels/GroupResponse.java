package smarthome.app.models.groupmodels;

public class GroupResponse {

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupResponse(int id) {
        this.id = id;
    }

    private int id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupResponse(String name) {
        this.name = name;
    }
}
