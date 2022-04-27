package ie.tudublin;

import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode {
    private String nemaName;
    private float length;
    private boolean hasLimbs;
    private String gender;
    private boolean hasEyes;


    
    @Override
    public String toString() {
        return "Nematode [Name: " + nemaName + ", Length: " + length + ", Limbs: " + hasLimbs
                + ", Gender: " + gender + ", Eyes: " + hasEyes + "]"; 
    }

    public Nematode(TableRow tr)
    {
        this(
            tr.getString("Name"),
            tr.getFloat("Length"),
            tr.getInt("Limbs"),
            tr.getString("Gender"),
            tr.getInt("Eyes")
        );
    }

    public Nematode(String nemaName, float length, int hasLimbs, String gender, int hasEyes) {
        this.nemaName = nemaName;
        this.length = length;
        this.hasLimbs = hasLimbs();
        this.gender = gender;
        this.hasEyes = hasEyes();
    }

    public String nemaName() {
        return nemaName;
    }

    public void getNemaName(String nemaName) {
        this.nemaName = nemaName;
    }

    public Float length() {
        return length;
    }

    public void getLength(Float length) {
        this.length = length;
    }

    public boolean hasLimbs() {
        return hasLimbs;
    }

    public void getHasLimbs(boolean hasLimbs) {
        this.hasLimbs = hasLimbs;
    }

    public String gender() {
        return gender;
    }

    public void getGender(String gender) {
        this.gender = gender;
    }

    public boolean hasEyes() {
        return hasEyes;
    }

    public void nemaHasEyes(boolean hasEyes) {
        this.hasEyes = hasEyes;
    }

    public void render(NematodeVisualiser nm)
    {
        nm.textSize(20);
        nm.textAlign(PApplet.CENTER);
        nm.text(nemaName, nm.height - 50, nm.width / 2);
    }
}
