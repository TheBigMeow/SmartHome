package smarthome.app.models.groupmodels;

public class GroupCreated {

    private String Name;
    private int id;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GroupCreated(String name, int id) {
        Name = name;
        this.id = id;
    }
}
