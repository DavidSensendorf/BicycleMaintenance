package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BrakePad;

import java.util.List;

public interface BrakePadDao {
    public BrakePad getBrakePad(int brakePadId);
    public List<BrakePad> getAllBrakePads(int bicycleId);
    public BrakePad createBrakePad(BrakePad brakePad);
    public void updateBrakePad(BrakePad updatedBrakePad);
    public void deleteBrakePad(int brakePadId);

}
