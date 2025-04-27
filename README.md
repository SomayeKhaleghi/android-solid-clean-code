# android-solid-clean-code
# Compose vs TextWatcher - SOLID Interface Segregation Example

This repository contains two small Android projects demonstrating how Jetpack Compose improves upon the traditional View system regarding the Interface Segregation Principle (SOLID).

## Projects

- **traditional-textwatcher**  
  Uses EditText and TextWatcher (violates Interface Segregation by forcing unused methods).

- **compose-textfield**  
  Uses Jetpack Compose's TextField and onValueChange callback (respects Interface Segregation).

## Why?

In the traditional Android View system, `TextWatcher` requires implementing three methods even if only one is needed.  
Jetpack Compose simplifies this with a single `onValueChange` callback, fully respecting clean code and SOLID design principles.


## License

MIT License
