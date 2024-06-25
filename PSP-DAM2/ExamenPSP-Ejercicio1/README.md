**ReadMe**

**Código de ejemplo de hilos en Java**

Este código de ejemplo muestra cómo usar hilos en Java para simular a tres jardineros que trabajan en diez jardines.

El código se divide en dos clases:

* La clase `Main` crea un objeto de la clase `Jardines` y tres objetos de la clase `Jardineros`. Los objetos de la clase `Jardineros` representan a los jardineros.
* La clase `Jardineros` representa a un jardinero. El jardinero se ejecuta en su propio hilo. El hilo del jardinero se repite durante 30 segundos. En cada repetición, el jardinero elige un jardín al azar para trabajar. Después de trabajar en el jardín durante un segundo, el jardinero termina de trabajar en el jardín.

La clase `Jardines` representa los diez jardines. La clase tiene un método `trabajar()` que devuelve un índice de jardín aleatorio. El método `terminar()` marca el jardín como libre.


**Salida del código**

La salida del código es la siguiente:

```
Jardinero 0 trabajando en el jardín 3
Jardinero 1 trabajando en el jardín 6
Jardinero 2 trabajando en el jardín 2
Jardinero 0 terminó de trabajar en el jardín 3
Jardinero 1 terminó de trabajar en el jardín 6
Jardinero 2 terminó de trabajar en el jardín 2

Jardinero 0 trabajando en el jardín 7
Jardinero 1 trabajando en el jardín 0
Jardinero 2 trabajando en el jardín 1
Jardinero 0 terminó de trabajar en el jardín 7
Jardinero 1 terminó de trabajar en el jardín 0
Jardinero 2 terminó de trabajar en el jardín 1

...
```
