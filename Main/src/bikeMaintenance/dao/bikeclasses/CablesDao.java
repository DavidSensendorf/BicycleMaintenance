package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Cables;

import java.util.List;

public interface CablesDao {
    public Cables getCables(int cablesId);
    public List<Cables> getAllCables(int bicycleId);
    public Cables createCables(Cables cables);
    public void updateCables(Cables updatedCables);
    public void deleteCables(int cablesId);

}
