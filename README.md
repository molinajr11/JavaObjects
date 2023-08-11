# Interface Vs Abstract Clas 
| Interface  | Abstract Class |
| ------------- | ------------- |
| Permite Herencia multiple | no permite Herencia multiple
| No permite implementaciones de metodos  |  si permite implementacione de metodos |
| No contiene constructor  | si permite tener constructor 👷 que puede ser accedido mediante super.|
| no tiene modificadores de acceso todo es plublico | si pude tener modificadores de acceso :accessibility: |
# Polimorfismo ✔️
Es la capacidad de un objeto de ser referenciado por varios tipos.
- podemos ver el polimorfismo de 3 formas:
- cuando una clase se extiende de otra.
- cuando una clase implementa una interfaz.
- cuando sobreEscirbimos un metodo. 
# herencia ventaja 
- La herencia captura lo que es común y aísla lo que es diferente entre clases.

# Interface ventajas 
- Garantiza que todos los métodos de clase que implementan una interfaz se puedan llamar de forma segura.
- Con composiciones e interfaces tendremos más flexibilidad con nuestro código, ya que no estaremos apegados al acoplamiento que propone la herencia.

# Algo de arrays 
- Un array es una estructura de datos y se usa para almacenar elementos (valores primitivos o referencias)
- Los arrays usan corchetes ([]) sintácticamente
- ¡Los arrays tienen un tamaño fijo!
- ¡Un array también es un objeto!
- Los arrays son zero-based(el primer elemento se encuentra en la posición 0)
- Un array siempre se inicializa con los valores padron.
- Al acceder a una posición no válida recibimos la excepción ArrayIndexOutOfBoundException
- Las matrices tienen un atributo length para conocer el tamaño
- La forma literal de crear un array, utilizando llaves {}.