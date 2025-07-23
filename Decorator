import java.util.*;

public class Main {
    public static void main(String[] args) {
      BasePizza BasePizza = new Olive(new Olive(new Margarita()));
      System.out.println(BasePizza.getCost());
  }
}

public abstract class BasePizza{
  abstract int getCost();
}

public class Margarita extends BasePizza{
  
  Margarita(){
    
  }
  
  int getCost(){
    return 5;
  }
  
}

public abstract class PizzaDecorator extends BasePizza{
   
}

public class Olive extends PizzaDecorator{
  BasePizza basePizza;
  
  Olive(BasePizza basePizza){
    this.basePizza=basePizza;
    return ;
  }
  
  int getCost(){
    return basePizza.getCost()+10;
  }
  
}



