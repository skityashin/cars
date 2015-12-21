package com.levelup.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Class {@link com.levelup.model.Truck}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */

@Entity
@DiscriminatorValue("Truck")
public class Truck extends Cars{

}
