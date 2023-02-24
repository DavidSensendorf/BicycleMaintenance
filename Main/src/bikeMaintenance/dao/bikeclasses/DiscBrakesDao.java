package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.DiscBrakes;

import java.util.List;

public interface DiscBrakesDao {
    DiscBrakes getDiscBrakes(int discBrakesId);
    List<DiscBrakes> getAllDiscBrakes(int bicycleId);
    DiscBrakes createDiscBrakes(DiscBrakes discBrakes);
    void updateDiscBrakes(DiscBrakes discBrakes);
    void deleteDiscBrakes(int discBrakesId);
}
