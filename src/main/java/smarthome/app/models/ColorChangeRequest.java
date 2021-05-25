package smarthome.app.models;

public class ColorChangeRequest {
    private int id;
    private int r;
    private int g;
    private int b;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public ColorChangeRequest(int id, int r, int g, int b) {
        this.id = id;
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public ColorChangeRequest() {}
}
