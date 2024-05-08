# ED_rodrigoyr-ED_Caso-Final-de-los-Finales-Integrador

## Ejercicio 1
### 1) En relación al estado de un objeto, para preservar el principio de encapsulación: ###
**En relación al estado de un objeto, para preservar el principio de encapsulación:**
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
*2 - 3 - 4 - 5*

**2)     Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.**
*Las tablas Hash son estructura de datos que podemos usar para acceder rapidamente a datos ya que aquí las colisiones son poco frecuentes. Entre las operaciones que podemos realizar están insertar, buscat y eliminar pares clave-valor. Como he comentado entre las ventajas encontramos el rápido acceso y la búsqueda eficiente en grandes conjuntos de datos. El problema aquí lo encontramos cuando hay muchas colisiones ya que su rendiemiento disminuye.
Un árbol, es una estructura de datos que se organiza de manera similar a la de u árbol de verdad, con esto podemos mantender los dtos ordenadas y realizar búsquedas de manera corrects. entre las operaciones que podemos rewlizar están insertar, buscar y eliminar valores de dicho árbol en general de manera rápida y precisa. Si el árbol está desequilibrado puede afectar en los tempos y la organización del mismo.
Teniendo esto en cuenta, deberíamos usar la tabla Hash cuando lo que realmente nos importa es el tiempo, ya que aquí como henos comentado las colisiones son poco probables. Si por el contrario nos interesa más la organización y la eficiencia, las árboles son nuestra mejor opción, y aún así conseguiremos tiempos de búsqueda excelentes*

**3)     Explica las diferencias entre un a pila y una cola. ¿ Cuándo conviene utilizar cada una de estas estructuras? ¿ Cuál es el orden de complejidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.**
*Las pilas son estructuras de datos en las que la primera que entra es la primera que sale. Se utilizan normalmente para implementar operaciones, como la reversión de una lista de elementos, el seguimiento de funciones y la evaluación de expresiones. En general se utilizan cuando necesitas acceder rapidamente al ultimo elemento que has insertado y es útil cuando nevcesitas seguir un orden contrario a medida que se procesan los elementos.
La cola es una estructura del mismo tipo, es decir, la primera que entra es la primera que sale, estas son últiles para situaciones donde el orden de llegada de los elememtos es importante, tareas etc. Aquí, en general lo vamos a utilizar cuando necesitas procesar elementos en el orden que llegaron,  y en tareas de procesamiento donde nos interesa que se procesen primero los elementos que llegaron primero.
En relación al orden de complejidad computacional, para ambas el de las operaciones básicas que he nombrado antes suele ser O(1). Aunque, es importante tener en cuenta que dependiendo de la implementación y las operaciones que se realicen, puede haber casos donde el rendimiento cambie. Por ejemplo, si necesitas eliminar elementos en medio de la cola, puede ser más eficiente usar una estructura de datos diferente, como una lista enlazada*


**4)     Explica   el    método    de    ordenación    denominado    inserción  y describe  las i teraciones sobre el s iguiente conjunto de datos: 50 20 84 13 22 16 89 85**
*El método de ordenación "insercion" es un metodo simple pero muy eficaz que sirve para ordenar una lista de elementos. Funciona cómo si ordenaras cartas en tu mano. Comenzamos con el segundo elemento de la lista y lo comparamos con el primero. Si el segundo elemento es menor, los intercambiamos. Luego, avanzamos al tercer elemento y lo comparamos con los anteriores, nos vamos hacia la izquierda hasta que encontramos su posición. Este proceso se repite para cada elemento hasta que todos estén correctamente*
Para la lista: 50, 20, 84, 13, 22, 16, 89, 85.
1. **Iteración 1:**
   - Lista actual: 50, 20, 84, 13, 22, 16, 89, 85
   - El 20 es menor que el 50, por lo se intercambian: 20, 50, 84, 13, 22, 16, 89, 85
2. **Iteración 2**:
   - Lista actual: 20, **50**, 84, 13, 22, 16, 89, 85
   - El 84 ya está bien
3. **Iteración 3**:
   - Lista actual: 20, 50, 84, 13, 22, 16, 89, 85]
   - El 13 es menor que el 84, así que hacia la izquierda: 20, 50, 13, 84, 22, 16, 89, 85
   - Luego, el 13 es menor que el 50, por lo que va hacia la izquierda: 20, 13, 50, 84, 22, 16, 89, 85
   - El 13 es menor que el 20, así que hacia la izquierda: 13, 20, 50, 84, 22, 16, 89, 85
4. **Iteración 4**:
   - Lista actual: 13, 20, 50, 84, 22, 16, 89, 85
   - El 22 es menor que el 84, así que lo mueve hacia la izquierda: 13, 20, 50, 22, 84, 16, 89, 85
5. **Iteración 5**:
   - Lista actual: 13, 20, 50, 22, 84, 16, 89, 85
   - El 16 es menor que el 84, así que lo desplaza hacia la izquierda: 13, 20, 50, 22, 16, 84, 89, 85
   - Luego, el 16 es menor que el 50, así que se mueve a hacia la izquierda: 13, 20, 50, 16, 22, 84, 89, 85
   - Finalmente, el 16 es menor que el 20, así que lo desplaza hacia la izquierda: 13, 16, 20, 50, 22, 84, 89, 85
6. **Iteración 6**:
   - Lista actual: 13, 16, 20, 50, 22, 84, 89, 85]
   - El 22 ya está en su posicion correcta.
7. **Iteración 7**:
   - Lista actual: 13, 16, 20, 50, 22, 84, 89, 85
   - El 89 ya está en su posición correcta.
8. **Iteración 8**:
   - Lista actual: [13, 16, 20, 50, 22, 84, **89**, **85**]
   - El 85 ya está en su posición correcta.
*Como vemos este metodo inserción, mediante diferentes interacions consigue ordenar la lista de menor a meyor: 13, 16, 20, 22, 50, 84, 85, 89*

**5)     Dadas dos funciones y su número de operaciones:
A = 1024 n
B = 16 n 3
Calcular a partir de qué tamaño de entrada n A es más eficiente que B.**
*Para determinar a partir de entrada la función A es mas eficiente que B, tenemos que encontrar el valor n para el que A es menor que B (A<B):
Dadas las funciones:
A = 1024n
B = 16n^3
La desigualdad sería:
1024n < 16n^3
Dividimos ambos lados de la desigualdad por  n:
1024 < 16n^2
Dividimos ambos lados de la desigualdad por 16:
64 < n^2
Tomamos la raíz cuadrada de ambos lados :
8 < n
Por lo tanto, A será más eficiente que B para valores de n mayores que 8.*
