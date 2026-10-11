# Práctica: Pilas Estáticas y Dinámicas en Java





## 1. Descripción del proyecto

Este repositorio contiene la implementación en Java de una **pila (stack)** de dos maneras distintas. Ambas siguen la política **LIFO** (*Last In, First Out*): el último elemento en entrar es el primero en salir.

| Archivo | Descripción |
|---|---|
| `PilaSimple.java` | Pila **estática**, basada en un arreglo de tamaño fijo (capacidad 5). |
| `PilaDinamica.java` | Pila **dinámica**, basada en nodos enlazados mediante referencias. |
| `Nodo.java` | Clase auxiliar con el dato (`dato`) y la referencia al siguiente nodo (`siguiente`). |
| `lanzador_pilasimple.java` | Programa de prueba de la pila estática. |
| `Main.java` | Programa de prueba de la pila dinámica. |

### Métodos implementados

| Método | Pila estática | Pila dinámica | Descripción |
|---|:---:|:---:|---|
| `push(int x)` | ✔ | ✔ | Inserta un elemento en la cima. La estática controla el desbordamiento. |
| `pop()` | ✔ | ✔ | Extrae el elemento de la cima. Controla el subdesbordamiento. |
| `mostrar()` | ✔ | ✔ | Imprime el contenido de la pila. |
| `isEmpty()` | ✔ | ✔ | Estática: `tope == -1`. Dinámica: `cima == null`. |
| `isFull()` | ✔ | ✘ | Solo en la estática: `tope == datos.length - 1`. |
| `peek()` | ✔ | ✔ | Consulta la cima **sin eliminarla**. |

> La pila dinámica no tiene `isFull()`, porque su capacidad depende únicamente de la memoria RAM disponible.

---

## 2. Diferencias conceptuales: almacenamiento estático vs. dinámico

**Almacenamiento estático (contiguo en memoria).** La pila usa un arreglo (`int[] datos = new int[5]`) que reserva un bloque continuo de memoria con tamaño fijo desde que se crea. Un índice llamado `tope` indica cuál es la última posición ocupada (`-1` significa vacía). Si el arreglo se llena, ya no se pueden insertar más datos (desbordamiento), aunque haya memoria libre en la computadora. Si se usa menos de la capacidad, el espacio restante queda reservado sin aprovecharse.

**Almacenamiento dinámico (nodos enlazados).** Cada elemento vive en un objeto `Nodo` que guarda su dato y una referencia al nodo que está debajo. La pila solo conserva la referencia `cima`, que apunta al nodo de arriba. Los nodos se crean en memoria conforme se necesitan y pueden estar en cualquier lugar. La pila crece y se reduce sin un límite fijo, a costa de guardar una referencia extra por cada elemento.

| Característica | Estática (arreglo) | Dinámica (nodos) |
|---|---|---|
| Memoria | Bloque contiguo de tamaño fijo | Nodos dispersos, uno por elemento |
| Capacidad | Limitada (5 elementos) | Limitada solo por la RAM |
| Desbordamiento | Sí (`isFull()`) | No aplica |
| Variable de control | `tope` (índice) | `cima` (referencia) |
| Memoria extra | Posiciones reservadas sin usar | Una referencia (`siguiente`) por nodo |
| `push` / `pop` | O(1) | O(1) |

### Comportamiento LIFO

```
push(10), push(20), push(30)           pop() -> sale 30

        cima                                   cima
         ↓                                      ↓
       [ 30 ]                                 [ 20 ]
       [ 20 ]                                 [ 10 ]
       [ 10 ]
```

---

## 3. Cómo compilar y ejecutar

**Requisitos:** JDK 17 o superior (se probó con JDK 17).

Los archivos usan la declaración `package EstructuraDeDatos.Estructuras_Lineales;`, por lo que deben estar dentro de esa estructura de carpetas:

```
src/
└── EstructuraDeDatos/
    └── Estructuras_Lineales/
        ├── Nodo.java
        ├── PilaSimple.java
        ├── PilaDinamica.java
        ├── lanzador_pilasimple.java
        └── Main.java
```

### Desde la terminal

Colócate dentro de la carpeta `src` y ejecuta:

```bash
# Compilar
javac EstructuraDeDatos/Estructuras_Lineales/*.java

# Ejecutar la prueba de la pila estática
java EstructuraDeDatos.Estructuras_Lineales.lanzador_pilasimple

# Ejecutar la prueba de la pila dinámica
java EstructuraDeDatos.Estructuras_Lineales.Main
```

### Desde IntelliJ IDEA

1. Abre el proyecto (`File > Open`) y verifica que los archivos estén en `src/EstructuraDeDatos/Estructuras_Lineales`.
2. Haz clic derecho sobre `lanzador_pilasimple` y elige **Run 'lanzador_pilasimple.main()'** para probar la pila estática.
3. Haz clic derecho sobre `Main` y elige **Run 'Main.main()'** para probar la pila dinámica.

---

## 4. Ejecución

"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\lib\idea_rt.jar=60230:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.1\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\pc\Documents\creando-tu-primera-aplicación\EstructuraDeDatos\out\production\EstructuraDeDatos EstructuraDeDatos.Estructuras_Lineales.lanzador_pilasimple
¿Vacía? true
Metiste: 10
Metiste: 20
Metiste: 30
Metiste: 40
Metiste: 50
¡Pila llena!
Pila actual: 10 20 30 40 50 
¿Llena? true
Cima (peek): 50
Pila actual: 10 20 30 40 50 
Sacaste: 50
Pila actual: 10 20 30 40 
¿Llena? false
Sacaste: 40
Sacaste: 30
Sacaste: 20
Sacaste: 10
¡Pila vacía!
¿Vacía? true
¡Pila vacía, no hay elemento en la cima!

Process finished with exit code 0
