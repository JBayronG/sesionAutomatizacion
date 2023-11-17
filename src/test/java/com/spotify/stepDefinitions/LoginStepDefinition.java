package com.spotify.stepDefinitions;

import com.spotify.models.SpotifyDat;
import com.spotify.tasks.OpenUp;
import com.spotify.tasks.SpotifyLogin;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;


public class LoginStepDefinition {

    @Before
    public void actorSetUp(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("que estoy en la pagina de Spotify")
    public void queEstoyEnLaPaginaDeSpotify() {
        theActorCalled("John").wasAbleTo(OpenUp.thePage());
    }
    @Cuando("ingreso mi usuario y clave")
    public void ingresoMiUsuarioYClave(List<SpotifyDat> data) {
    theActorInTheSpotlight().attemptsTo(SpotifyLogin.thepage(data));
    }
    @Entonces("ingreso exitosamente al menu.")
    public void ingresoExitosamenteAlMenu() {
    }

}
