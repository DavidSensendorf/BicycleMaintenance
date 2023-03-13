package com.sensendorf.bikemaintenancetest;

import com.sensendorf.bikemaintenance.Utilities;
import org.junit.Assert;
import org.junit.Test;

public class UtilitiesTests {
    @Test
    public void testToMiles(){

        Assert.assertEquals(4, Utilities.metersToMiles(6000));
        Assert.assertEquals(407, Utilities.metersToMiles(654616));
        Assert.assertEquals(3511, Utilities.metersToMiles(5649813));
        Assert.assertEquals(1, Utilities.metersToMiles(1610));
        Assert.assertEquals(3, Utilities.metersToMiles(4829));
        Assert.assertEquals(250, Utilities.metersToMiles(402336));
        Assert.assertEquals(6000, Utilities.metersToMiles(9656064));

    }

    @Test
    public void testToMeters(){

        Assert.assertEquals(6437, Utilities.milesToMeters(4));
        Assert.assertEquals(655003, Utilities.milesToMeters(407));
        Assert.assertEquals(5650407, Utilities.milesToMeters(3511));
        Assert.assertEquals(1609, Utilities.milesToMeters(1));
        Assert.assertEquals(4828, Utilities.milesToMeters(3));
        Assert.assertEquals(402336, Utilities.milesToMeters(250));
        Assert.assertEquals(9656064, Utilities.milesToMeters(6000));

    }
}
