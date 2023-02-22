package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.BrakePad;

import java.util.List;

public interface BrakePadDao {
    BrakePad getBrakePad(int brakePadId);
    List<BrakePad> getAllBrakePads(int bicycleId);
}
