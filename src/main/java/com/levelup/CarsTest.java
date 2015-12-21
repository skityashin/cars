package com.levelup;

import com.levelup.dao.Factory;
import com.levelup.model.SportCars;
import com.levelup.model.Truck;

/**
 * Class {@link com.levelup.CarsTest}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 21.12.15
 */

public class CarsTest {

    public static void main(String[] args) throws Exception {
        Truck cars1 = new Truck();
        SportCars cars2 = new SportCars();

        cars1.setPower(120);
        cars1.setSpeed(60);
        cars1.setColor("red");
        cars1.setDoorsCount(2);

        cars2.setSpeed(200);
        cars2.setPower(500);
        cars2.setColor("blue");
        cars2.setDoorsCount(4);

        Factory.getInstance().getTruckDao().saveTruckDao(cars1);
        Factory.getInstance().getSportCarsDao().saveSportCarsDao(cars2);

    }
}
