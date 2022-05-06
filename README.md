# ALOJAMIENTOS BORJA 

De primeras voy a cambiar muchas cosas porque hay cosas que se harían más fáciles con HTML pero no sé hacerlo todo a código o es más largo (como un input con una dirección de correo válida y esas cosas).

Añadir que todo los diagramas UML van a cambiar. De hecho hasta hace 1 semana no tenía ni idea de cómo iba a ser el programa o cómo quería que funcionase. 

Lo único realizado que es completamente funcional es crear usuarios de la empresa (los que ponen las viviendas en alquiler), crear viviendas y añadirlas a usuarios. Y a la vez una lista de usuarios con sus respectivas viviendas (o casas). El resto es parecido, crear una clase de empleados y de clientes, de reservas y de alquileres (contratos de alquiler?).

El proceder que ahora lo tengo claro es crear una base de datos para una empresa donde se puedan guardar datos de empleados, usuarios y clientes, gestionar las viviendas (o casas) en oferta y gestionar contratos. 
Podría añadir gestión de Recursos Humanos y crear un calendario??? o las cosas que hagan en Recursos Humanos, pero principalmente dar de alta o baja.

Todas las clases heredadas de Persona comparten el mismo tramo de ID, ninguno obtiene uno independiente de los otros.
(No me gustaria que hubiese un Usuario, un Cliente y un Empleado con el mismo ID).

Cosas por terminar:
- Todos los diagramas UML.
- Retocar las clases con funciones específicas
- Excepciones??
- JavaDoc
- Implementar lectura de fichero cada vez que se inicialice el programa y que escriba los datos introducidos cada vez que se meten
