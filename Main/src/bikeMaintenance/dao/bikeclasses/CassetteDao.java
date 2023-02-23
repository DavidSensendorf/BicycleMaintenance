package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Cassette;

import java.util.List;

public interface CassetteDao {
    public Cassette getCassette(int cassetteId);
    public List<Cassette> getAllCassettes(int bicycleId);
    public Cassette createCassette(Cassette cassette);
    public void updateCassette(Cassette updatedCassette);
    public void deleteCassette(int CassetteId);

}
