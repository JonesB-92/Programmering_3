# Abstract Factory - simpelt eksempel

Dette eksempel viser Abstract Factory pattern med to produktfamilier:

- Light theme
- Dark theme

## Roller

- `UiFactory`: abstract factory.
- `LightThemeFactory` og `DarkThemeFactory`: konkrete factories.
- `Button` og `Dialog`: abstrakte produkter.
- `LightButton`, `LightDialog`, `DarkButton`, `DarkDialog`: konkrete produkter.
- `Main`: klientkode der kun arbejder med abstraktioner.

## Klassediagram (Mermaid)

```mermaid
classDiagram
    class UiFactory {
        <<interface>>
        +createButton() Button
        +createDialog() Dialog
    }

    class Button {
        <<interface>>
        +render()
    }

    class Dialog {
        <<interface>>
        +open()
    }

    class LightThemeFactory
    class DarkThemeFactory
    class LightButton
    class DarkButton
    class LightDialog
    class DarkDialog

    UiFactory <|.. LightThemeFactory
    UiFactory <|.. DarkThemeFactory

    Button <|.. LightButton
    Button <|.. DarkButton
    Dialog <|.. LightDialog
    Dialog <|.. DarkDialog

    LightThemeFactory ..> LightButton : creates
    LightThemeFactory ..> LightDialog : creates
    DarkThemeFactory ..> DarkButton : creates
    DarkThemeFactory ..> DarkDialog : creates

```


