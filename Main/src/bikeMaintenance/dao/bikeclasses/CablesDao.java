package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Cables;

import java.util.List;

public interface CablesDao {
    Cables getCables(int cablesId);
    List<Cables> getAllCables(int bicycleId);
    Cables createCables(Cables cables);
    void updateCables(Cables updatedCables);
    void deleteCables(int cablesId);

}
