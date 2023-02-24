package bikemaintenance.dao.bikeclasses;

import bikemaintenance.bikeclasses.Wheel;

import java.util.List;

public interface WheelDao {
    Wheel getWheel(int wheelId);
    List<Wheel> getAllWheels(int wheelId);
    Wheel createWheel(Wheel Wheel);
    void updateWheel(Wheel Wheel);
    void deleteWheel(int wheelId);
}
