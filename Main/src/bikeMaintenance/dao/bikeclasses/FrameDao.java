package bikemaintenance.dao.bikeclasses;


import bikemaintenance.bikeclasses.Frame;

import java.util.List;

public interface FrameDao {
    Frame getFrame(int frameId);
   // List<Frame> getAllFrames(int bicycleId);
    Frame createFrame(Frame frame);
    void updateFrame(Frame frame);
    void deleteFrame(int frameId);
}
