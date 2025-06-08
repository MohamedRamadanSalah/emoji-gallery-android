package android.bignerdranch.myemojy;

public class Emoji {

    String name;
    String Descrb;
    int imageResId;

    public Emoji(String name, String descrb,int imageResId) {
        this.name = name;
        Descrb = descrb;
        this.imageResId =  imageResId;
    }
    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrb() {
        return Descrb;
    }

    public void setDescrb(String descrb) {
        Descrb = descrb;
    }
}

