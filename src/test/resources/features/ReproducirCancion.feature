#language: es

  Característica: Buscar una cancion en Spotify
   Yo como usuario quiero buscar una cancion en Spotify, para escucharla.


  Antecedentes: Inicio exitoso
    Dado que estoy en la pagina de Spotify
    Y  ingreso mi usuario y clave
         | Usuario | 12345678a |


  Escenario: busqueda exitosa.
    Cuando ingresa el nombre de la cancion
    Y presiona la tecla Enter
    Entonces el usuario podra reproducir una cancion