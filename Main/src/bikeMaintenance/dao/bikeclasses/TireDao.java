package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Tire;

import java.util.List;

public interface TireDao {
    Tire getTire(int tireId);
    List<Tire> getAllTires(int tireId);
    Tire createTire(Tire tire);
    void updateTire(Tire tire);
    void deleteTire(int tireId);
}
