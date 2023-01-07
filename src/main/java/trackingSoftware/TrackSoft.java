package trackingSoftware;

import javax.xml.stream.Location;

public class TrackSoft {

    public static void main(String[] args) {

Driver driver1 = new Driver();/////

    driver1.name = "Messi";   //////driver1 it's a referance name
    driver1.age = 37;
   driver1.isNew = true;

 driver1.printInfo();   ////// printing out the information
 driver1.reportAccident(" La");
  driver1.drive();






    }


}
