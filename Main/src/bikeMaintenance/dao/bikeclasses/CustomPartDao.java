package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.CustomPart;

import java.util.List;

public interface CustomPartDao {
    CustomPart getCustomPart(int partId);
    List<CustomPart> getAllCustomParts(int bicycleId);
    CustomPart createCustomPart(CustomPart customPart);
    void updateCustomPart(CustomPart customPart);
    void deleteCustomPart(int customPartId);
}
