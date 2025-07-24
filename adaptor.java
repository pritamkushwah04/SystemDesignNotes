import java.util.*;

public class Main {
    public static void main(String[] args) {
      WeightMachineAdapterImpl weightMachineAdapterImpl = new WeightMachineAdapterImpl(new WeightMachine());
      System.out.println(weightMachineAdapterImpl.getWeightInKg());
  }
}


public class WeightMachine{
  
  int getWeightInPound(){
    // logic
    return 5;
  }
}

public interface WeightMachineAdapter{
  
  
  int getWeightInKg();
  
}

public class WeightMachineAdapterImpl implements WeightMachineAdapter{
     WeightMachine weightMachine;
  
    WeightMachineAdapterImpl(WeightMachine weightMachine){
      this.weightMachine=weightMachine;
    }
  
    public int getWeightInKg(){
    // logic to convert
    return weightMachine.getWeightInPound()*10;
  }
  
}
