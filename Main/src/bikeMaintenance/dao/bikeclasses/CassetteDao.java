package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Cassette;

import java.util.List;

public interface CassetteDao {
    Cassette getCassette(int cassetteId);
    List<Cassette> getAllCassettes(int bicycleId);
    Cassette createCassette(Cassette cassette);
    void updateCassette(Cassette updatedCassette);
    void deleteCassette(int CassetteId);

}
