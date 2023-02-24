package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.RimBrakes;

import java.util.List;

public interface RimBrakesDao {
    RimBrakes getRimBrakes(int rimBrakesId);
    List<RimBrakes> getAllRimBrakes(int bicycleId);
    RimBrakes createRimBrakes(RimBrakes rimBrakes);
    void updateRimBrakes(RimBrakes rimBrakes);
    void deleteRimBrakes(int rimBrakesId);
}
