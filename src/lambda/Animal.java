package lambda;

public class Animal {
  private String species;
  private boolean canHop;
  private boolean canSwim;

  public Animal(String speciesName, boolean hopper, boolean swimmer) {
    species = speciesName;
    canHop = hopper;
    canSwim = swimmer;
  }

  public boolean canHop() {
    return canHop;
  }

  public boolean canSwim() {
    return canSwim;
  }

  @Override
  public String toString() {
    return species;
  }
}

interface CheckTrait {
  public boolean test(Animal a);
}
