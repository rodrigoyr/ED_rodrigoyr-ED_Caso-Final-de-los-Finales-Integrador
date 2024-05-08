# ED_rodrigoyr-ED_Caso-Final-de-los-Finales-Integrador

## Ejercicio 1
### 1) En relación al estado de un objeto, para preservar el principio de encapsulación: ###
*b)    Debemos establecer la visibilidad más restrictiva (por ejemplo, privada) en los atributos de una clase. Así, cualquier software que utilice nuestro objeto, sólo accederá al estado de los objetos mediante los métodos que le hayamos permitido utilizar.*

### 2)     Los métodos de una clase no pueden devolver objetos:
*b)    Falso*

### 3)     ¿Cuál de las siguientes características de la programación orientada a objetos está relacionada con la reutilización de código?
*b)    Herencia*

### 4)     El tiempo de acceso a un dato en una lista de tipo LinkedList es en el mejor de los casos de:
*b)    O(1)*

### 5)     Un algoritmo de ordenación que implemente el método de inserción se basa en la idea de ir seleccionando el número correspondiente en la lista desordenada que se va a insertar en la posición última de la lista ordenada:
*a)    Verdadero*

## Ejercicio 2: Responda a las cuestiones
**Se debe responder a 4 preguntas de las 5 disponibles. Las 4 preguntas a contestar son elegidas libremente por el estudiante.**
*Realizo los ejercicios 2 - 3 - 4 - 5*

### 2)     Explica las diferencias entre una tabla Hash y un árbol. ¿ Cuándo conviene utilizar cada una de estas estructuras? Justifique su respuesta y analice todas las posibles operaciones a realizar por las estructuras. No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.
*Las tablas Hash son estructura de datos que podemos usar para acceder rapidamente a datos ya que aquí las colisiones son poco frecuentes. Entre las operaciones que podemos realizar están insertar, buscat y eliminar pares clave-valor. Como he comentado entre las ventajas encontramos el rápido acceso y la búsqueda eficiente en grandes conjuntos de datos. El problema aquí lo encontramos cuando hay muchas colisiones ya que su rendiemiento disminuye.
Un árbol, es una estructura de datos que se organiza de manera similar a la de u árbol de verdad, con esto podemos mantender los dtos ordenadas y realizar búsquedas de manera corrects. entre las operaciones que podemos rewlizar están insertar, buscar y eliminar valores de dicho árbol en general de manera rápida y precisa. Si el árbol está desequilibrado puede afectar en los tempos y la organización del mismo.
Teniendo esto en cuenta, deberíamos usar la tabla Hash cuando lo que realmente nos importa es el tiempo, ya que aquí como henos comentado las colisiones son poco probables. Si por el contrario nos interesa más la organización y la eficiencia, las árboles son nuestra mejor opción, y aún así conseguiremos tiempos de búsqueda excelentes*

### 3)     Explica las diferencias entre un a pila y una cola. ¿ Cuándo conviene utilizar cada una de estas estructuras? ¿ Cuál es el orden de complejidad computacional de estas estructuras? No redacte el orden tal y como puede ver en los apuntes, razónelo con sus propias palabras y argumentos.
*Las pilas son estructuras de datos en las que la primera que entra es la primera que sale. Se utilizan normalmente para implementar operaciones, como la reversión de una lista de elementos, el seguimiento de funciones y la evaluación de expresiones. En general se utilizan cuando necesitas acceder rapidamente al ultimo elemento que has insertado y es útil cuando nevcesitas seguir un orden contrario a medida que se procesan los elementos.
La cola es una estructura del mismo tipo, es decir, la primera que entra es la primera que sale, estas son últiles para situaciones donde el orden de llegada de los elememtos es importante, tareas etc. Aquí, en general lo vamos a utilizar cuando necesitas procesar elementos en el orden que llegaron,  y en tareas de procesamiento donde nos interesa que se procesen primero los elementos que llegaron primero.
En relación al orden de complejidad computacional, para ambas el de las operaciones básicas que he nombrado antes suele ser O(1). Aunque, es importante tener en cuenta que dependiendo de la implementación y las operaciones que se realicen, puede haber casos donde el rendimiento cambie. Por ejemplo, si necesitas eliminar elementos en medio de la cola, puede ser más eficiente usar una estructura de datos diferente, como una lista enlazada*

### 4)     Explica   el    método    de    ordenación    denominado    inserción  y describe  las i teraciones sobre el s iguiente conjunto de datos: 50 20 84 13 22 16 89 85
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

### 5)     Dadas dos funciones y su número de operaciones:
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

## Ejercicio 3: Dado el siguiente algoritmo recursivo:
### Preguntas:
### a) ¿Qué imprime el código? En caso de que no compile indique el motivo y arregle el programacomo considere conveniente. Explique su solución de manera concisa.
*El código imprime:
Exception in thread "main" java.lang.StackOverflowError
	at Main.recursive(Main.java:18)
	at Main.recursive(Main.java:18)
	at Main.recursive(Main.java:18)
               ...  
El error java.lang.StackOverflowError es causado por una recursión infinita en el método recursive. El método recursive se llama a sí mismo indefinidamente cuando el segundo argumento b es negativo. El segundo argumento es -2, esto lo que provoca es la recursión infinita. La recursión infinita llena la pila de llamadas, lo que finalmente resulta en StackOverflowError.  Para solucionar este problema, puedes agregar una condición en tu método recursive para manejar los casos en los que b es negativo. En la carpeta "Ejercicio 3" puede observar el código principal en la clase Main, y, en la clase MainCorregido, el código solucionando el error descrito*
*He solucionado el erro añadiendo una condicion en el metodo recursive para manejar cuando b es negativo*
![image](https://github.com/rodrigoyr/ED_rodrigoyr-ED_Caso-Final-de-los-Finales-Integrador/assets/146821758/374cfb08-79ad-49bc-977c-dccd6a2cb15a)

### b) Explica brevemente qué cálculo está haciendo y qué tipo de recursividad está empleando.
*El método recursive está implementando una forma de recursividad lineal para calcular la potencia de un número. Es decir, está calculando a elevado a la potencia de b (a^b).
La recursividad lineal ocurre cuando una función se llama a sí misma y no hay bucles.*
El cálculo se realiza así:
*1. Si b es 0, el método retorna 1, ya que cualquier numero elevado 0 es 1.
2. Si a es 0 o b es negativo, el método devuelve 0. En el caso de a siendo 0, cualquier 0 elevado a cualquier número es 0. En el caso de b siendo negativo, se ha añadido esta condición para evitar la recursión infinita, que es el problema que hemos visto
3. Si ninguna de las condiciones anteriores se cumple, el método se llama a sí mismo con b disminuido en 1, y multiplica el resultado por a. Esto es la parte recursiva del método que calcula la potencia.*

## Ejercicio 4
### Calcular de forma recursiva la suma de los dígitos de un número siendo un ejemplo el número 102 -> 1 + 0 + 2 = 3. Recuerde que puede realizar los cambios de tipo que crea necesarios para facilitar la resolución
### ¿ Qué tipo de recursividad se está empleando? ¿ Qué complejidad computacional t iene el algoritmo?
*El tipo de recursividad que se está empleando es la recursividad lineal. En este tipo de recursividad, la función se llama a sí misma una vez en cada paso de la recursión.  La complejidad computacional del algoritmo es O(n), n es el número de dígitos del número de entrada. Esto se debe a que la función se llama a sí misma una vez por cada dígito del número. En cada llamada, se realiza una cantidad constante de trabajo (dividir el número por 10 y sumar el dígito restante), por lo que el tiempo total es proporcional al número de digitos. Pienso que es la mejor manera de conseguir la solucion de este ejercicio. Puede encontrar el ejercicio en la carpeta Ejercicio 4*
![image](https://github.com/rodrigoyr/ED_rodrigoyr-ED_Caso-Final-de-los-Finales-Integrador/assets/146821758/99e2f838-8f0f-43d6-98a2-a94624d01486)

## Ejercicio 5
*Puede encontrar el ejercicio completo en la carpeta Ejercicio 5*
*Este trabajo me ha llevado alrededor de 1h:15min completarlo, pienso que ha sifo bastante complicado y exigente debido al tiempo del que disponiamos y de la presion que este caso final ejercia. En general estoy bastante contento con este ultimo ejercicio, como puede observar he conseguido resolver las diferentes clases que he creado e intsnciar e importar unas en otras para poder hacer uso de sus funcionalidades en otras clase. Finalmente el problema real llega a la hora de crear la interfaz de usuario de la clase Main, ya que tengo todos los metodos y funciones conseguidos pero no llego a la solucion de poder impmentarlos en la interfax de suaurio gráfica, al final algunos de ellos he consegido implmentarlos, como puede observar en las diferentes clases y módulos, todo el programa está conseguido, aunque la parte final del usuario se me ha complicado un poco: Repito, en general estoy bastante contento con este ejercicio/programa ya que teniendo en cuenta el tiempo que teníamos, además de haber realizado otros 4 ejercicios seguidos, he conseguido sacar adeante de la mejor manera este proyecto, me quedo con las ganas de haber podido implmentar todas las funciones y métodod creados en la intreracción con el usuario, ya que a mi parecer, es lo más importante. Muchas gracias.*
