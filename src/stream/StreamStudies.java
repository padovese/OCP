package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamStudies {
  public static void main(String[] args) {
    String[] a = {"a", "b", "c"};
    List<String> list = Arrays.asList(a);

    System.out.println(list.stream().count());

    list.stream().filter(v -> v.equals("a") || v.equals("c")).forEach(System.out::println);

    List<Employee> employees = populateObjects();

    employees
        .stream()
        .forEach(e -> e.getDepartment().setName(e.getDepartment().getName().toUpperCase()));

    employees.stream().forEach(e -> System.out.println(e.getDepartment().getName()));
  }

  private static List<Employee> populateObjects() {
    Department hr = new Department();
    hr.setId(1);
    hr.setName("Human Resources");
    Employee padovese = new Employee();
    padovese.setId(1);
    padovese.setName("Bruno Padovese");
    padovese.setDepartment(hr);

    Department engineering = new Department();
    engineering.setId(2);
    engineering.setName("Engineering");
    Employee patricia = new Employee();
    patricia.setId(2);
    patricia.setName("Patricia Prospero");
    patricia.setDepartment(engineering);

    Department security = new Department();
    security.setId(3);
    security.setName("Security");
    Employee sofia = new Employee();
    sofia.setId(3);
    sofia.setName("Sofia Padovese");
    sofia.setDepartment(security);

    List<Employee> employees = new ArrayList<>();
    employees.add(padovese);
    employees.add(patricia);
    employees.add(sofia);

    return employees;
  }
}

class Employee {
  private int id;
  private String name;
  private Department department;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }
}

class Department {
  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
