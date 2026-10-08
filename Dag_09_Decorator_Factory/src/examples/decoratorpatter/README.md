# Decorator - simpelt eksempel

Dette eksempel viser Decorator pattern med `Coffee` som component.

Rollerne er nu fordelt pa separate filer i `examples.decoratorpatter` for at gore strukturen tydeligere.

- `Coffee`: component-interface.
- `SimpleCoffee`: concrete component.
- `CoffeeDecorator`: abstrakt decorator.
- `MilkDecorator` og `SugarDecorator`: konkrete decorators.
- `Main`: klientkode der kombinerer decorators dynamisk.

## Hvorfor bruge Decorator?

Decorator gør det muligt at tilføje ny funktionalitet til et objekt uden at ændre den oprindelige klasse.
I eksemplet kan vi tilføje mælk og sukker til kaffe ved at pakke objektet ind i decorators.

## Klassediagram (Mermaid)

```mermaid
classDiagram
    class Main {
        +main()
        -printCoffee(String label, Coffee coffee)
    }

    class Coffee {
        <<interface>>
        +getDescription() String
        +getPrice() int
    }

    class SimpleCoffee {
        +getDescription() String
        +getPrice() int
    }

    class CoffeeDecorator {
        <<abstract>>
        -coffee: Coffee
        #getCoffee() Coffee
    }

    class MilkDecorator {
        +getDescription() String
        +getPrice() int
    }

    class SugarDecorator {
        +getDescription() String
        +getPrice() int
    }

    Coffee <|.. SimpleCoffee
    Coffee <|.. CoffeeDecorator
    CoffeeDecorator <|-- MilkDecorator
    CoffeeDecorator <|-- SugarDecorator
    CoffeeDecorator --> Coffee : wraps

    Main ..> Coffee : uses
    Main ..> SimpleCoffee : creates
    Main ..> MilkDecorator : composes
    Main ..> SugarDecorator : composes
```

## Kør

```powershell
javac -d out src\examples\decoratorpatter\*.java
java -cp out examples.decoratorpatter.Main
```
