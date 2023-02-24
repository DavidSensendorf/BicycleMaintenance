package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Derailleur;

import java.util.List;

public interface DerailleurDao {
    Derailleur getDerailleur(int derailleurId);
    List<Derailleur> getAllDerailleurs(int bicycleId);
    Derailleur createDerailleur(Derailleur derailleur);
    void updateDerailleur(Derailleur derailleur);
    void deleteDerailleur(int derailleurId);
}
