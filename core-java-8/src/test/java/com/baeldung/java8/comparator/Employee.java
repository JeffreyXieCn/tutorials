package com.baeldung.java8.comparator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Employee implements Comparable<Employee>{
    String name;
    int age;
    double salary;
    long mobile;
    
    @Override
    public int compareTo(Employee argEmployee) {
        return name.compareTo(argEmployee.getName());
    }

//    @Override
//    public boolean equals(Object obj) {
//      if (this == obj) return true;
//      if (obj == null) return false;
//      if (getClass() != obj.getClass()) return false;
//      Employee other = (Employee) obj;
//      if (age != other.age) return false;
//      if (mobile != other.mobile) return false;
//      if (name == null) {
//        if (other.name != null) return false;
//      } else if (!name.equals(other.name)) return false;
//      if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary)) return false;
//      return true;
//    }
//
//    @Override
//    public int hashCode() {
//      final int prime = 31;
//      int result = 1;
//      result = prime * result + age;
//      //long is 64 bits, (int) (mobile ^ (mobile >>> 32)) will be the result of XOR mobile's higher 32 bits and lower 32 bits
//      result = prime * result + (int) (mobile ^ (mobile >>> 32));
//      result = prime * result + ((name == null) ? 0 : name.hashCode());
//      long temp;
//      temp = Double.doubleToLongBits(salary);
//      result = prime * result + (int) (temp ^ (temp >>> 32));
//      return result;
//    }
    
}
