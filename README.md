# DVD Item Management


The code in this repository was created as part of a college assignment. It demonstrates the implementation of a Java class to manage DVD items and is intended for educational purposes.

## *Attributes*:

- `id`: An integer representing the ID of the DVD.
- `nome`: A string representing the name of the DVD.
- `preco`: A double representing the price of the DVD.
- `descricao`: A string representing the description of the DVD.
- `anoLancamento`: An integer representing the release year of the DVD.

## *Constructor*:

The constructor initializes the DVD object with provided values for ID, name, price, description, and release year.
Getter and Setter Methods:

- `getDescricao()`: Get the description of the DVD.
- `getAnoLancamento()`: Get the release year of the DVD.
- `setDescricao(String descricao)`: Set the description of the DVD.
- `setAnoLancamento(int anoLancamento)`: Set the release year of the DVD.
- `toString() Method`: Overrides the `toString()` method to provide a formatted string representation of the DVD item, including its ID, name, price, description, and release year.

## *Usage*
You can use the "DVD" class in your Java application to manage DVD items. Create instances of the "DVD" class and use its methods to get and set attributes and retrieve formatted information about DVD items.

Example

```
java
Copy code
public class Main {
    public static void main(String[] args) {
        DVD dvd = new DVD(1, "Sample DVD", 19.99, "A sample DVD description", 2020);
        System.out.println(dvd.toString());
    }
}
```

This will create a "DVD" object, print its details, and demonstrate the usage of the class.

