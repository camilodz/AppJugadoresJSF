/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author JORGE
 */
public class PruebaJugadoresIT {
    
    private static WebDriver manejador;
    WebElement txt_Identificador;
    WebElement txt_Nombres;
    WebElement txt_Apellidos;
    WebElement txt_FechaNac;
    WebElement txt_Email;
    WebElement txt_Deporte;
    WebElement btn_Guardar;
    WebElement msgValidarId;
    
    @BeforeClass
    public static void inicializarManejador(){
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability("marionette", true);
        
        manejador = new ChromeDriver();
        manejador.get("http://localhost:8080/MiPrimerAppWebJugadoresJSF/faces/jugador/Create.xhtml");
    }    
      
    @AfterClass
    public static void eliminarManejador(){
        //manejador.quit();
    }
    
    
    
    @Test
    public void testSimple() throws Exception {
        txt_Identificador = manejador.findElement(By.id("form:idJug"));
        txt_Nombres = manejador.findElement(By.id("form:nombreJug"));
        txt_Apellidos = manejador.findElement(By.id("form:apellidoJug"));
        txt_FechaNac = manejador.findElement(By.id("form:fechaNacJug"));
        txt_Email = manejador.findElement(By.id("form:email"));
        txt_Deporte = manejador.findElement(By.id("form:idDeporte"));
        
        //botones
        btn_Guardar = manejador.findElement(By.id("form:btnGuardarJug"));
        
        //Asiganar Valores
        txt_Identificador.sendKeys("");
        txt_Nombres.sendKeys("Nuevo");
        txt_Apellidos.sendKeys("NuevoApe");
        txt_FechaNac.sendKeys("11/12/1994");
        txt_Email.sendKeys("nuevo@nuevo.com");
        txt_Deporte.sendKeys("Fútbol");
        btn_Guardar.click();
        
        msgValidarId = manejador.findElement(By.id("form:msgValidarId"));
        String cadena = msgValidarId.getText();
        Assert.assertEquals(cadena, "");
        
    }
    
}
