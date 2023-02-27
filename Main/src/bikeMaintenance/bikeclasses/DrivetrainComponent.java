package bikemaintenance.bikeclasses;

public class DrivetrainComponent extends BikePart{
    private int speeds;
    private String size;
    private String lubeType;
    private boolean isWaxed;

    public int getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int speeds) {
        this.speeds = speeds;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLubeType() {
        return lubeType;
    }

    public void setLubeType(String lubeType) {
        this.lubeType = lubeType;
    }

    public boolean isWaxed() {
        return isWaxed;
    }

    public void setWaxed(boolean waxed) {
        isWaxed = waxed;
    }
}
