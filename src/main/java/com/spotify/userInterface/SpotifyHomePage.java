package com.spotify.userInterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.spotify.com/")
public class SpotifyHomePage extends PageObject {
    public static Target INICIAR_SESION  =Target.the("Clic en el boton Iniciar Sesión").located(By.xpath("//*/div/button/span[text() = 'Iniciar sesión']"));
}
