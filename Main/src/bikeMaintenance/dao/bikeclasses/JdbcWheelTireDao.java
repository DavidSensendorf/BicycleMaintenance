package bikemaintenance.dao.bikeclasses;

import bikemaintenance.model.bikeclasses.WheelTire;

import java.util.List;

public class JdbcWheelTireDao implements WheelTireDao{
    @Override
    public WheelTire getWheelTire(int wheelTireId) {
        return null;
    }

    @Override
    public List<WheelTire> getAllBicycleWheelTires(int wheelTireId) {
        return null;
    }

    @Override
    public List<WheelTire> getAllBicycleWheelTires(int wheelTireId, String partType) {
        return null;
    }

    @Override
    public WheelTire createWheelTire(WheelTire wheelTire) {
        return null;
    }

    @Override
    public void updateWheelTire(WheelTire updatedWheelTire) {

    }

    @Override
    public void deleteWheelTire(int wheelTireId) {

    }
}
