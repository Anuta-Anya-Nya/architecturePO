package Model.Domain;

public class Hall {
    private String name;
    private Photo photo;
    public Hall(String name, Photo photo) {
        this.name = name;
        this.photo = photo;
    }
    @Override
    public String toString() {
        return "Hall [name=" + name + ", photo=" + photo + "]";
    }
}
