package com.spotify.tasks;

import com.spotify.models.SpotifyDat;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import java.util.List;

import static com.spotify.userInterface.LoginPage.*;

public class SpotifyLogin implements Task {

    private List<SpotifyDat> data;
    public SpotifyLogin(List<SpotifyDat> data){
        this.data = data;
    }

    public static SpotifyLogin thepage(List<SpotifyDat> data){
        return Tasks.instrumented(SpotifyLogin.class,data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Enter.theValue(data.get(0).getUsuario()).into(LOGIN_USERNAME),
        Enter.theValue(data.get(0).getPass()).into(LOGIN_PASSWORD),
                Click.on(LOGIN_BUTTON)
                );
    }
}
