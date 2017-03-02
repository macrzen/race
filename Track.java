import javafx.scene.Group;

import java.util.ArrayList;
import java.util.Random;

public class Track extends Group {

    private ArrayList<Location> locations;
    private ArrayList<Car> cars;

//    public Track(ArrayList<Location> locations, ArrayList<Car> cars) {
//        this.locations = locations;
//        this.cars = cars;
//   }

    public Track() {
        locations = new ArrayList<>();
        cars = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++)
            locations.add(new Location(rand.nextInt(500), rand.nextInt(500), ""+i));


        for (int j = 0; j < 3; j++) {
            double tmpX = locations.get(j).getX();
            double tmpY = locations.get(j).getY();
            cars.add(new Car(tmpX, tmpY, locations.get(j), locations.get((locations.size()-1)-j)));
        }

        for(Location location : locations) this.getChildren().add(location);
        for(Car car : cars) this.getChildren().add(car);
    }


}