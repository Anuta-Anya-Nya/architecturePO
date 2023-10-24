package Model.Domain;

public class Table {
    private static int count = 1;
    private int id;
    private int places;
    private Hall hall;
    private Photo photo;

    public Table(int places, Hall hall, Photo photo) {
        this.id = count;
        count++;
        this.places = places;
        this.hall = hall;
        this.photo = photo;
    }

    public static int getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Table [id=" + id + ", places=" + places + ", hall=" + hall + ", photo=" + photo + "]";
    }
}
