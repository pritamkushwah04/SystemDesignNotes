import java.util.*;

public class Main {
    public static void main(String[] args) {
      Vehicle vehicle = new Bus();
      vehicle.drive();// NormalDrive
  }
}


public interface DriveStrategy{
  void drive();
}


public class SportyDrive implements DriveStrategy{
  @Override
  public void drive(){
    System.out.println("SportyDrive impl");
  }
}

public class NormalDrive implements DriveStrategy{
  @Override
  public void drive(){
    System.out.println("NormalDrive impl");
  }
}


public class Vehicle{
  
  DriveStrategy driveStrategy;
  
  Vehicle(DriveStrategy driveStrategy){// constructor injetion
    this.driveStrategy=driveStrategy;
  }
  
  void drive(){
    driveStrategy.drive();
  }
}

public class SportsVehicle extends Vehicle{
  
  SportsVehicle(){
    super(new SportyDrive());
  }
}

public class Bus extends Vehicle{
  
  Bus(){
    super(new NormalDrive());
  }
}

public class Truck extends Vehicle{
  
  Truck(){
    super(new NormalDrive());
  }
}












