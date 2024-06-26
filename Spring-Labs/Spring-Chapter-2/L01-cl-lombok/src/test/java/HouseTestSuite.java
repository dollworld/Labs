import Lab.Model.House;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseTestSuite {

    /**
     * Simple test to assure that the equals and hashcode implementations have been override to work with
     * instances of the HouseClass
     */
    @Test
    public void testEqualsAndHashCodeMethods(){
        House testHouse1 = new House();
        testHouse1.id = 10;
        testHouse1.address = "123 pennsylvania street";
        testHouse1.bedrooms = 4;
        testHouse1.bathrooms = 3;
        testHouse1.squareFeet = 2400;

        House testHouse2 = new House();
        testHouse2.id = 10;
        testHouse2.address = "123 pennsylvania street";
        testHouse2.bedrooms = 4;
        testHouse2.bathrooms = 3;
        testHouse2.squareFeet = 2400;

        Assertions.assertEquals(testHouse1, testHouse2);
        Assertions.assertTrue(testHouse1.hashCode() == testHouse2.hashCode());
    }

    /**
     * Simple test to assure that the toString implementations have been override to work with
     * instances of the HouseClass
     */
    @Test
    public void testToStringMethod(){
        House testHouse = new House();
        testHouse.id = 10;
        testHouse.address = "123 pennsylvania street";
        testHouse.bedrooms = 4;
        testHouse.bathrooms = 3;
        testHouse.squareFeet = 2400;

        boolean isToStringImplemented = testHouse.toString().contains("pennsylvania");

        Assertions.assertTrue(isToStringImplemented);
    }

}
