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
  
  int getCost(){
    return 5;
  }
  
}

public abstract class PizzaDecorator extends BasePizza{

    protected BasePizza basePizza;

    public PizzaDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
   
}

public class Olive extends PizzaDecorator{
  public Olive(BasePizza basePizza) {
        super(basePizza);
    }

    public int getCost() {
        return basePizza.getCost() + 10;
    }
}



