package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Chainring;

import java.util.List;

public interface ChainringDao {
    Chainring getChainring(int chainringId);
    List<Chainring> getAllChainrings(int bicycleId);
    Chainring createChainring(Chainring chainring);
    void updateChainring(Chainring chainring);
    void deleteChainring(int chainringId);

}
