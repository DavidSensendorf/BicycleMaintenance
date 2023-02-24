package bikemaintenance.dao.bikeclasses;

import bikemaintenance.userdata.Bicycle;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcBicycleDao implements BicycleDao {



    @Override
    public Bicycle getBicycle(int bicycleId) {
        Bicycle bicycle = null;
        String sql = "Select * " +
                     "FROM bicycle" +
                     "WHERE bicycleId = ?;";
        //SqlRowSet
                return bicycle;
    }

    @Override
    public List<Bicycle> getAllUserBicycles(int userId) {
        return null;
    }

    @Override
    public Bicycle createBicycle(Bicycle bicycle) {
        return null;
    }

    @Override
    public void updateBicycle(Bicycle updatedBicycle) {

    }

    @Override
    public void deleteBicycle(int bicycleId) {

    }
}
