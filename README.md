##############################################
# Aplicación dca-dev			     #
##############################################

Santiago Sáez Caselles

Sobre el proyecto ---------------------------------------

Esta es una aplicación spring-boot creada por mi para la práctica 9 de la asignatura de "Diseño colaborativo de Aplicaciones".

Su objetivo es hacer un estudio de la herramienta git en los proyectos.

Se ha alojado este proyecto en este repositorio de github ------> https://github.com/Santiaghost/dca-scv

El proyecto contiene 3 ramas:
-La rama "master" : Rama principal que solo se mergeará una vez el proyecto esté acabado.
-La rama "feature/provocarError" : Rama desde la que empezamos a trabajar pero que abandonamos por contener una versión
de la aplicación con errores.
-La rama "ramaRecuperada" : Rama que creamos a partir del commit "good" que determinamos usando el bisect que contiene todo
lo implementado para esta práctica

Lo primero que se ha hecho ha sido inicializar los controladores y modelo en varios commit para que funcionen correctamente.

1) Git Bisect

Para probar Bisect he realizado dos pruebas:

En la primera después de todos los commits funcionando correctamente he introducido otro fallo a propósito.

Después introduje en la bash de git:
- git bisect start : Iniciamos
- git bisect bad : Señalamos como erróneo el commit en el que estamos
- git bisect good <commit> : Recuperamos el commit que estaba bien(en este caso el commit ac86452dee8fbe8267f5974502a7cae63945b8bb)
- git bisect reset: Me devuelve el commit bueno.

El problema de hacer esto es que al hacer push a github el commit del que quería deshacerme sigue presente.

En la segunda he introducido un commit bueno y luego un fallo.

Después introduje en la bash de git:
- git bisect start : Iniciamos
- git bisect bad : Señalamos como erróneo el commit en el que estamos
- git bisect good <commit> : Recuperamos el commit que estaba bien(en este caso el commit e1f0fca26cfa2bb792ea391eb59299d4466f418b)
- git bisect reset <commit> : Reseteamos al commit bueno
- git switch -c <rama> : Creamos una nueva rama donde guardamos la versión que funcionaba de la aplicación.

En esta segunda prueba ya he conseguido recuperar el commit en una nueva rama en la que trabajaríamos a partir de ahora, borrando la
rama donde estaba el commit erróneo

2) Git hook

Para probar git hook he creado scripts en los archivos post-commit y pre-commit.

En pos-commit he escrito "git push origin ramaRecuperada" para que haga push una vez que está hecho el commit. Aprovechando que
estamos en un proyecto springboot en pre-commit he aprovechado para hacer "./mvnw test" de tal manera de que antes de ejecutar el
commit se asegure de que los test que hemos implementado en src/test ejecuten antes de hacer el commit y solo si pasan ejecuten el commit.
