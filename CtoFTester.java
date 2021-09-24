public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(15));
    System.out.println(celsiusToFahrenheit(42.4));

    System.out.println("\n");

    System.out.println(fahrenheitToCelsius(100));
    System.out.println(fahrenheitToCelsius(20));
  }

  /*
  What should the functions have as parameters?
    The functions should have the temperature to be converted into the other unit as parameters.
    For celsiusToFahrenheit, celsius should be the parameter.
    For fahrenheitToCelsius, fahrenheit should be the parameter.

  What type should they be?
    They could be either integers or doubles. I prefer to use doubles here so I don't have to converted
    later for division and multiplication. Plus, temperatures can have decimals so it's easier that way.

  What should the functions return?
    The functions should return the converted temperature.
    For celsiusToFahrenheit, it should return the fahrenheit equivilant of the inputted celsius.
    For fahrenheitToCelsius, it should return the celsius equivilant of the inputted fahrenheit.

  */

  public static double celsiusToFahrenheit(double celsius){
    double converted = celsius *1.8 + 32;
    return converted;
  }

  public static double fahrenheitToCelsius(double fahrenheit){
    double converted = (fahrenheit - 32) * (5.0/9.0);
    return converted;
  }
}
