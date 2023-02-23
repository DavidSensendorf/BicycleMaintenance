package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Chain;

import java.util.List;

public interface ChainDao {
    public Chain getChain(int chainId);
    public List<Chain> getAllChains(int bikeId);
    public Chain createChain(Chain chain);
    public void updateChain(Chain updatedChain);
    public void deleteChain(int chainId);
    // get  object (objectId)
    // get all  list<object> (int id)
    // create object (object)
    // update void (object)
    // delete void (int objectId)
}
