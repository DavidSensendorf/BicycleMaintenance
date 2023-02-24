package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Chain;

import java.util.List;

public interface ChainDao {
    Chain getChain(int chainId);
    List<Chain> getAllChains(int bicycleId);
    Chain createChain(Chain chain);
    void updateChain(Chain updatedChain);
    void deleteChain(int chainId);

}
