# Cerveceria
Profesor: 
1. Respecto a la consulta de cuántos consumidores se necesitan para que el stock llegue a 0, yo solo pude hacer andar el programa con un solo consumidor, si ponía más el programa no termina nunca de ejecutarse. La verdad no se cuál es el error que estoy cometiendo. Lo hice guiandome de los ejemplos que hizo Pablo cuando explicó el tema.-

2. Synchronized permite que entre un hilo a la vez a la memoria común, por lo tanto los bloques de código que acceden a ese espacio de memoria deben utilizar la palabra reservada Synchronized para evitar que ambos entren a la vez en el mismo espacio de memoria. Con Synchronized, hasta tanto el hilo que entró no termmine de ejecutar las sentencias, no puede entrar el otro hilo.-

3. Tanto el productor, como el consumidor comparten el mismo objeto de la clase BeerHouse, ese sería el recurso compartido. Por ese motivo los métodos producer y consumer se declaran como synchronized para asegurar la exclusión mutua en la zona crítica. 

4. Respecto a las formas de instanciar un Thread, en Programación Avanzada vimos dos:

* La primer forma es: Extender directamente de la clase Thread, cuando la clase no debe extender de ninguna otra superclase.-
* La segunda forma es: Si nuestra clase debe extender de otra superclase como solo se permite extender de una única clase, y si extiendo de Thread ya no podría extender de otra clase, en lugar de extender de Thread se implementa la interfaz Runnable.
* La tercer forma no la vimos, pero googleando encontré que se puede: "Pasarle un Runnable al constructor de Thread creando una clase anónima", sin embargo, recomiendan no utilizar esta forma.-



