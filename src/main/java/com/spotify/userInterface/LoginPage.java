package com.spotify.userInterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static Target LOGIN_USERNAME = Target.the("Ingresar Usuario o Email").located(By.id("login-username"));
    public static Target LOGIN_PASSWORD = Target.the("Ingresar la contraseña").located(By.id("login-password"));
    public static Target LOGIN_BUTTON = Target.the("Clic en Iniciar Sesión").located(By.id("login-button"));
}
