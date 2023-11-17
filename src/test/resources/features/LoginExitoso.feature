#language: es

  Característica: Inicio de sesion Spotify
    Yo como usuario de Spotify, quiero iniciar sesion con mi credenciales
    Para escuchar musica.

  Escenario: Inicio exitoso
    Dado que estoy en la pagina de Spotify
    Cuando ingreso mi usuario y clave
      | usuario | pass |
      |Pepito   |12345678a|
    Entonces ingreso exitosamente al menu.

