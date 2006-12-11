/**
 * Copyright 2005 Darren L. Spurgeon
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ajaxtags.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class simulate a Car Service. It's not intended to be used as a good example (we recomend 
 * that you use interfaces, etc).
 * 
 * @author Darren Spurgeon
 * @version $Revision: 1.1 $ $Date: 2006-12-11 03:11:32 $
 */
public class CarService {

  /**
   * Hardcoded list of cards, so that we do not have to use a database in the examples.
   */
  static final List cars = new ArrayList();

  static {
    cars.add(new Car("Ford", "Escape"));
    cars.add(new Car("Ford", "Expedition"));
    cars.add(new Car("Ford", "Explorer"));
    cars.add(new Car("Ford", "Focus"));
    cars.add(new Car("Ford", "Mustang"));
    cars.add(new Car("Ford", "Thunderbird"));

    cars.add(new Car("Honda", "Accord"));
    cars.add(new Car("Honda", "Civic"));
    cars.add(new Car("Honda", "Element"));
    cars.add(new Car("Honda", "Ridgeline"));

    cars.add(new Car("Mazda", "Mazda 3"));
    cars.add(new Car("Mazda", "Mazda 6"));
    cars.add(new Car("Mazda", "RX-8"));
  }

  /**
   * Constructor for CarService.
   */
  public CarService() {
    super();
  }

  /**
   * Get all models for a particular car maker.
   * 
   * @param make the make of the car
   * @return a {@java.util.List} of {@org.ajaxtags.demo.Car} objects
   */
  public List getModelsByMake(String make) {
    List l = new ArrayList();
    for (Iterator iter = cars.iterator(); iter.hasNext();) {
      Car car = (Car) iter.next();
      if (car.getMake().equalsIgnoreCase(make)) {
        l.add(car);
      }
    }
    return l;
  }

  /**
   * Get all models that start with name.
   * 
   * @param name the name of the car model
   * @return a {@java.util.List} of {@org.ajaxtags.demo.Car} objects
   */
  public List getModelsByName(String name) {
    List l = new ArrayList();
    for (Iterator iter = cars.iterator(); iter.hasNext();) {
      Car car = (Car) iter.next();
      if (car.getModel().toLowerCase().startsWith(name.toLowerCase())) {
        l.add(car);
      }
    }
    return l;
  }

  /**
   * Get all cars
   * 
   * @return a {@java.util.List} of {@org.ajaxtags.demo.Car} objects
   */
  public List getAllCars() {
    return cars;
  }
}
