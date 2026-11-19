# Métodos Numéricos para EDOs: Euler y Runge-Kutta 4 (Java)

**Actividad Unidad 5 Métodos Numéricos**
**Instituto Tecnológico Superior de Xalapa, Ingeniería en Sistemas Computacionales**

**Alumno:** Jose Francisco Hernandez Herrera
**Docente:** Víctor Hugo Vásquez Herrera

Programas en Java que resuelven ecuaciones diferenciales ordinarias con el método de Euler (y' = x - y) y con Runge-Kutta de 4to orden (y' = x + y), y comparan contra la solución analítica exacta calculando el error absoluto.



## Cómo clonar

```bash
git 
cd 
```

## Cómo compilar

```bash
mkdir out
javac -d out src/*.java
```

## Cómo ejecutar

```bash
java -cp out MetodoEuler
java -cp out MetodoRungeKutta
```

Para probar otros tamaños de paso en Euler, se cambia el valor de `h` en el `main` de `MetodoEuler.java` (por ejemplo 0.1, 0.05 y 0.01) y se vuelve a compilar.

## Estructura del proyecto

```
src/
├── MetodoEuler.java
└── MetodoRungeKutta.java
README.md
```
