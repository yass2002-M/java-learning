# Java — Bases

## Qu'est-ce que Java ?

Java est un langage orienté objet, compilé et portable (grâce à la JVM).

- Compilé : `javac` transforme le `.java` en `.class` (en bytecode)
- Portable : le `.class` tourne sur n'importe quelle machine avec une JVM 
- Orienté objet : tout le code est dans des classes

## Structure d'un programme Java

```java

public class MaClasse {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

```
## Conditions

### if / else if / else
```java
if (condition) {
    // ...
} else if (autreCondition) {
    // ...
} else {
    // ...
}
