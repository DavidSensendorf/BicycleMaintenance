package bikemaintenance.userdata;

import java.util.List;

public class User {
    private List<Bicycle> bicycleList;

    public List<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public void setBicycleList(List<Bicycle> bicycleList) {
        this.bicycleList = bicycleList;
    }
}
