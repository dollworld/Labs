package Lab.Model;

import lombok.*;

/**
 * Lombok is a took that can automatically generate boilerplate code such as ToString, Equals, HashCode, Constructors,
 * and all the needed getters/setters at runtime using annotations. Lombok is not part of Spring, but will be quite
 * useful for making our model classes from here on out. You can check out the Town class for examples
 * of the annotations used for this.
 *
 * TODO: Use Lombok to automatically generate a ToString and Equals method for this class at runtime.
 */
public class House {
    public long id;
    public String address;
    public long squareFeet;
    public long bedrooms;
    public double bathrooms;
}
