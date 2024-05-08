# ED_rodrigoyr-ED_Caso-Final-de-los-Finales-Integrador

### Ejercicio 1
**1)     En relación al estado de un objeto, para preservar el principio de encapsulación:**
*b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.*

**2)     Los métodos de una clase no pueden devolver objetos:**
*b)    Falso*

**3)     ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?**
*b)    Herencia*

**4)     El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:**
*b)    O(1)*

**5)     Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:**
*a)    Verdadero*

### Ejercicio 2

**1)     Debemos diseñar un programa para un s i stema de dispositivos portables aplicados  en  telemedicina  que  contienen  una  cantidad  de  memoria  muy l imitada ( 4 KB). Tenemos diferentes alternativ as que hacen diferente uso de la computación y la memoria.
a)    La primera de ellas t iene un orden de complejidad computacional O( n) y va a ocupar un espacio S( 1 ).
b)    La segunda de ellas t iene un orden de complejidad computacional O( 1 ) pero lo hace mediante una técnica denominada para guardar muchos datos en memoria, por lo que ocupa un espacio de S( N 2 ).
c)     La tercera y última t iene una complejidad computacional de O( log 2 ( N)) y ocupa un poco más de espacio en memoria S( O( log 2 ( N))).
Debemos analizar la eficiencia computacional de las mismas y justificar la elección. Teniendo en cuenta que el programa va a tener un tamaño de datos de entrada de 64 KB.**

**2)     Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.**
Las tablas Hash son estructura de datos que podemos usar para acceder rapidamente a datos ya que aquí las colisiones son poco frecuentes. Entre las operaciones que podemos realizar están insertar, buscat y eliminar pares clave-valor. Como he comentado entre las ventajas encontramos el rápido acceso y la búsqueda eficiente en grandes conjuntos de datos. El problema aquí lo encontramos cuando hay muchas colisiones ya que su rendiemiento disminuye.
Un árbol, es una estructura de datos que se organiza de manera similar a la de u árbol de verdad, con esto podemos mantender los dtos ordenadas y realizar búsquedas de manera corrects. entre las operaciones que podemos rewlizar están insertar, buscar y eliminar valores de dicho árbol en general de manera rápida y precisa. Si el árbol está desequilibrado puede afectar en los tempos y la organización del mismo.
Teniendo esto en cuenta, deberíamos usar la tabla Hash cuando lo que realmente nos importa es el tiempo, ya que aquí como henos comentado las colisiones son poco probables. Si por el contrario nos interesa más la organización y la eficiencia, las árboles son nuestra mejor opción, y aún así conseguiremos tiempos de búsqueda excelentes.

Tabla Hash: Cuando la velocidad de acceso es fundamental y las colisiones son poco probables.
Árbol: Para mantener datos ordenados y realizar búsquedas eficientes, especialmente cuando se necesita garantizar tiempos de búsqueda logarítmicos.
Los árboles son útiles cuando se necesita mantener los datos ordenados y realizar operaciones de búsqueda eficientes. En particular, los árboles de búsqueda binaria son excelentes para este propósito, ya que garantizan tiempos de búsqueda logarítmicos en el peor de los casos. Sin embargo, el rendimiento de los árboles puede degradarse si el árbol se vuelve desequilibrado, lo que puede ocurrir en inserciones o eliminaciones frecuentes.

**Cuándo utilizar cada estructura:**

- **Tabla Hash:** Se suele preferir cuando el tiempo de búsqueda y acceso rápido es fundamental, especialmente para grandes conjuntos de datos donde las colisiones son poco frecuentes. Son ideales cuando la relación entre las claves y los valores no requiere un orden específico.
  
- **Árbol:** Es más adecuado cuando se necesita mantener los datos ordenados y se espera realizar operaciones de búsqueda frecuentes. Son útiles cuando se necesita garantizar un tiempo de búsqueda logarítmico y las operaciones de inserción y eliminación no son demasiado frecuentes.

En resumen, la elección entre una tabla hash y un árbol depende de las características específicas del problema y de los requisitos de rendimiento, como la velocidad de acceso, la eficiencia de búsqueda y la necesidad de mantener los datos ordenados.


**3)     Explica las diferencias entre un a pila y una cola. ¿ Cuándo conviene utilizar cada una de estas estructuras? ¿ Cuál es el orden de complejidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.**

**4)     Explica   el    método    de    ordenación    denominado    inserción               y     describe  las i teraciones sobre el s iguiente conjunto de datos: 50 20 84 13 22 16 89 85**

**5)     Dadas dos funciones y su número de operaciones:
A = 1024 n
B = 16 n 3
Calcular a partir de qué tamaño de entrada n A es más eficiente que B.**
