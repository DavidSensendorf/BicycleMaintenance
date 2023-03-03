package bikemaintenance.model.userdata;

import bikemaintenance.model.bikeclasses.Bicycle;

import java.util.List;

public class Cyclist {
    private List<Bicycle> bicycleList;
    private int cyclistId;

    public int getCyclistId() {
        return cyclistId;
    }

    public void setCyclistId(int cyclistId) {
        this.cyclistId = cyclistId;
    }

    public List<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public void setBicycleList(List<Bicycle> bicycleList) {
        this.bicycleList = bicycleList;
    }
}
