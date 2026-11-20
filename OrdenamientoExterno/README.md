# Práctica de Mezcla Directa (Ordenamiento Externo)

**Docente:** Víctor Hugo Vásquez Herrera
**Alumno:** Jose Francisco Hernandez Herrera

## Cómo clonar, configurar y ejecutar

### 1. Clonar el repositorio

Desde la terminal:

```bash
git clone <enlace-del-repositorio>
```

O desde IntelliJ IDEA: **File > New > Project from Version Control**, pegar el enlace del repositorio y dar clic en **Clone**.

### 2. Configurar el proyecto en el IDE

1. Usar el JDK 17 o uno más nuevo (**File > Project Structure > Project > SDK**).
2. Verificar que la carpeta `src` esté marcada como **Sources Root** (clic derecho en `src > Mark Directory as > Sources Root`).
3. Verificar que `f1.txt` y `f2.txt` estén en la carpeta raíz del proyecto, al mismo nivel que `src`. Cada archivo tiene un número por renglón.

### 3. Ejecutar

1. Abrir `src/Metodos_de_ordenamiento/MezclaDirectaPractica.java`.
2. Dar clic en el botón verde de `main` y elegir **Run 'MezclaDirectaPractica.main()'**.
3. Al terminar se crea el archivo `f3.txt` en la carpeta raíz, con los números ya mezclados.

Si sale "Error en E/S de archivos", es porque `f1.txt` o `f2.txt` no están en la carpeta raíz.

## Salida en consola

```text

Tamano de bloque L = 4
f1.txt: 12 45 50 60 3 4
f2.txt: 23 78 10 20 8 9
Bloque intercalado con exito!
f3.txt: 12 23 45 50 60 78 10 20 3 4 8 9
```
