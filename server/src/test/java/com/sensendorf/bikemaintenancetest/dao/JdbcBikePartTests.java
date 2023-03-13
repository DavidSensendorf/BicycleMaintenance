package com.sensendorf.bikemaintenancetest.dao;

import com.sensendorf.bikemaintenancetest.BaseTests;
import com.sensendorf.bikemaintenance.dao.bikeclasses.JdbcBikePartDao;
import com.sensendorf.bikemaintenance.model.bikeclasses.BikePart;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JdbcBikePartTests extends BaseTests {

    private JdbcBikePartDao bikePartDao;

    private final BikePart testPart1 = new BikePart(-1, 1, "newTestPart1",
            "newDescription1", "newManufacturer1", "newModel1", 1981, "newFrame1",
            LocalDate.parse("2001-01-01"), 11, 11, 11, "newCarbon1", "newroad1");
    private final BikePart testPart2 = new BikePart(-1, 2, "newTestPart2",
            "newDescription2", "newManufacturer2", "newModel2", 1981, "newFrame2",
            LocalDate.parse("2002-01-01"), 12, 12, 12, "newCarbon2", "newroad2");

    private final BikePart updatePart1 = new BikePart(1, 2, "newTestPart2",
            "newDescription2", "newManufacturer2", "newModel2", 1981, "newFrame2",
            LocalDate.parse("2002-01-01"), 12, 12, 12, "newCarbon2", "newroad2");

    @Before
    public void setup(){
        bikePartDao = new JdbcBikePartDao(dataSource);
    }
    @Test
    public void getBikePart_returns_correct_part() {
        BikePart bikePart = bikePartDao.getBikePart(1);
        Assert.assertEquals("part1", bikePart.getName());
        Assert.assertEquals("manufacturer1", bikePart.getManufacturer());
        Assert.assertEquals("model1", bikePart.getModel());
        Assert.assertEquals(1971, bikePart.getModelYear());
        Assert.assertEquals(1, bikePart.getBicycleId());

        bikePart = bikePartDao.getBikePart(2);
        Assert.assertEquals("part2", bikePart.getName());
        Assert.assertEquals("manufacturer2", bikePart.getManufacturer());
        Assert.assertEquals("model2", bikePart.getModel());
        Assert.assertEquals(1972, bikePart.getModelYear());
        Assert.assertEquals(1, bikePart.getBicycleId());

        bikePart = bikePartDao.getBikePart(4);
        Assert.assertEquals("part4", bikePart.getName());
        Assert.assertEquals("manufacturer4", bikePart.getManufacturer());
        Assert.assertEquals("model4", bikePart.getModel());
        Assert.assertEquals(1974, bikePart.getModelYear());
        Assert.assertEquals(2, bikePart.getBicycleId());
    }

    @Test
    public void getBikePart_returns_null_invalid_id(){
        Assert.assertEquals(null, bikePartDao.getBikePart(-1));
    }

    @Test
    public void getAllBicycleBikeParts_returns_correct_list(){
        List<BikePart> bikePartList = new ArrayList<>();
        bikePartList = bikePartDao.getAllBicycleBikeParts(1);
        Assert.assertEquals(3, bikePartList.size());

        bikePartList = bikePartDao.getAllBicycleBikeParts(1, "Frame2");
        Assert.assertEquals(2, bikePartList.size());
        Assert.assertEquals("description3", bikePartList.get(1).getDescription());
    }
    @Test
    public void getAllBicycleBikeParts_returns_null_invalid_id(){
        Assert.assertEquals(null, bikePartDao.getAllBicycleBikeParts(-1));
    }
    @Test
    public void createBikePart_creates_appropriate_object() {
        BikePart bikePart = bikePartDao.createBikePart(testPart1);
        Assert.assertEquals(9, bikePart.getBikePartId());
        Assert.assertEquals("newDescription1", bikePart.getDescription());
        Assert.assertEquals("newFrame1", bikePart.getPartType());

        //TODO: test more fields?
    }
    @Test
    public void updateBikePart_updates_correctly() {
        bikePartDao.updateBikePart(updatePart1);
        Assert.assertEquals("newTestPart2", bikePartDao.getBikePart(1).getName());
        //TODO: test more fields?


//        private final BikePart updatePart1 = new BikePart(1, 2, "newTestPart2",
//                "newDescription2", "newManufacturer2", "newModel2", 1981, "newFrame2",
//                LocalDate.parse("2002-01-01"), 12, 12, 12, "newCarbon2", "newroad2");

    }
    @Test
    public void updateBikePart_returns_false_invalid_part(){
        updatePart1.setBikePartId(-1);
        Assert.assertEquals(false, bikePartDao.updateBikePart(updatePart1));

    }
    @Test
    public void deleteBikePart_deletes_correct_part() {
        Assert.assertEquals(true, bikePartDao.deleteBikePart(1));
        Assert.assertEquals(2, bikePartDao.getAllBicycleBikeParts(1).size());

        //todo: specific test for getallbikepart by id and part type

        Assert.assertEquals(null, bikePartDao.getBikePart(1));
    }
    @Test
    public void deleteBikePart_returns_false_invalid_part(){
        Assert.assertEquals(false, bikePartDao.deleteBikePart(-1));
    }
}
