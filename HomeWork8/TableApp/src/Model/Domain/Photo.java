package Model.Domain;

public class Photo {
    private String adress;

    public Photo(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Photo [adress=" + adress + "]";
    }
}
