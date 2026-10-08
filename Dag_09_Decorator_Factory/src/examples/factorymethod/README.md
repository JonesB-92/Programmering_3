# Factory Method - simpelt eksempel

Dette eksempel viser Factory Method pattern med `Notification` som produkt.

- `Notification`: interface for produkter.
- `EmailNotification` og `SmsNotification`: konkrete produkter.
- `NotificationCreator`: abstrakt creator med factory method `createNotification()`.
- `EmailCreator` og `SmsCreator`: konkrete creators.
- `Main`: klientkode der bruger creator-typen uden at kende konkret produktklasse.

## Klassediagram (Mermaid)

```mermaid
classDiagram
    

    class Notification {
        <<interface>>
        +send(String message)
    }

    class EmailNotification {
        +send(String message)
    }

    class SmsNotification {
        +send(String message)
    }

    class NotificationCreator {
        <<abstract>>
        +createNotification() Notification
    }

    class EmailCreator {
        +createNotification() Notification
    }

    class SmsCreator {
        +createNotification() Notification
    }

    Notification <|.. EmailNotification
    Notification <|.. SmsNotification

    NotificationCreator <|-- EmailCreator
    NotificationCreator <|-- SmsCreator

    EmailCreator ..> EmailNotification : creates
    SmsCreator ..> SmsNotification : creates

```
