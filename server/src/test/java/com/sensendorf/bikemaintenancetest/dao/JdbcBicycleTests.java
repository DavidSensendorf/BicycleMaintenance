package com.sensendorf.bikemaintenancetest.dao;

import com.sensendorf.bikemaintenancetest.BaseTests;
import com.sensendorf.bikemaintenance.dao.bikeclasses.JdbcBicycleDao;
import com.sensendorf.bikemaintenance.model.bikeclasses.Bicycle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JdbcBicycleTests extends BaseTests {

    private JdbcBicycleDao bicycleDao;
    private final Bicycle testBicycle1 = new Bicycle(-1, 1, "testbike1", "testdescription1");
    private final Bicycle testBicycle2 = new Bicycle(-1, 2, "testbike2", "testdescription2");
    private final Bicycle testBicycle3 = new Bicycle(-1, 3, "testbike3", "testdescription3");
    private final Bicycle updatedBicycle1 = new Bicycle(1, 1, "updatebike1", "updatedescription1");
    private final Bicycle updatedBicycle2 = new Bicycle(4, 1, "updatebike2", "updatedescription2");

    @Before
    public void setup() {
        bicycleDao = new JdbcBicycleDao(dataSource);
    }


    @Test
    public void getBicycle_returns_correct_bicycle() {
        Bicycle bicycle = bicycleDao.getBicycle(1);
        //assertBicyclesMatch TODO: implement method later
        Assert.assertEquals("Bike1", bicycle.getBicycleName());
        Assert.assertEquals("Description1", bicycle.getDescription());

        bicycle = bicycleDao.getBicycle(2);
        Assert.assertEquals("Bike2", bicycle.getBicycleName());
        Assert.assertEquals("Description2", bicycle.getDescription());

        bicycle = bicycleDao.getBicycle(3);
        Assert.assertEquals("Bike3", bicycle.getBicycleName());
        Assert.assertEquals("Description3", bicycle.getDescription());

        bicycle = bicycleDao.getBicycle(4);
        Assert.assertEquals("Bike1", bicycle.getBicycleName());
        Assert.assertEquals("Description1", bicycle.getDescription());
    }
    @Test
    public void getBicycle_invalid_id(){
        Assert.assertEquals(null, bicycleDao.getBicycle(-1));
    }
    @Test
    public void getAllUserBicycles_returns_correct_array() {
        List<Bicycle> bicycleList = new ArrayList<>();
        bicycleList = bicycleDao.getAllUserBicycles(1);
        Assert.assertEquals(3, bicycleList.size());
        Assert.assertEquals(3, bicycleList.get(2).getBicycleId());

        bicycleList = bicycleDao.getAllUserBicycles(2);
        Assert.assertEquals(1, bicycleList.size());

        bicycleList = bicycleDao.getAllUserBicycles(3);
        Assert.assertEquals(3, bicycleList.size());

        bicycleList = bicycleDao.getAllUserBicycles(4);
        Assert.assertEquals(2, bicycleList.size());
    }
    @Test
    public void getAllUserBicycles_invalid_id(){
        bicycleDao.getAllUserBicycles(-1);
    }
    @Test
    public void createBicycle_creates_appropriate_object() {
        Bicycle newBicycle = bicycleDao.createBicycle(testBicycle1);
        Assert.assertEquals(10, newBicycle.getBicycleId());
        Assert.assertEquals("testbike1", bicycleDao.getBicycle(10).getBicycleName());


        newBicycle = bicycleDao.createBicycle(testBicycle2);
        Assert.assertEquals(11, newBicycle.getBicycleId());


        newBicycle = bicycleDao.createBicycle(testBicycle3);
        Assert.assertEquals(12, newBicycle.getBicycleId());
        List<Bicycle> bicycleList = new ArrayList<>();

    }

    @Test
    public void updateBicycle_updates_correctly() {
        bicycleDao.updateBicycle(updatedBicycle1);
        Assert.assertEquals("updatebike1", bicycleDao.getBicycle(1).getBicycleName());
        Assert.assertEquals("updatedescription1", bicycleDao.getBicycle(1).getDescription());
        Assert.assertEquals(1, bicycleDao.getBicycle(1).getCyclistId());

        bicycleDao.updateBicycle(updatedBicycle2);
        Assert.assertEquals("updatebike2", bicycleDao.getBicycle(4).getBicycleName());
    }
    @Test
    public void updateBicycle_invalid_id(){
        Bicycle updatedBicycleInvalid = new Bicycle(-1, 1, "updatebike1", "updatedescription1");
        Assert.assertEquals(false, bicycleDao.updateBicycle(updatedBicycleInvalid));
    }
    @Test
    public void deleteBicycle_deletes_correct_bicycle(){
        bicycleDao.deleteBicycle(1);
        Assert.assertEquals(2, bicycleDao.getAllUserBicycles(1).size());

        Assert.assertNull(bicycleDao.getBicycle(1));
    }
    @Test
    public void deleteBicycle_invalid_id(){
        Assert.assertEquals(false, bicycleDao.deleteBicycle(-1));
    }



}
