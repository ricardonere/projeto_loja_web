package modulos.produtos;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Web do Modulo de Produtos")
public class ProdutosTest {
@Test
@DisplayName("Náo é permitido registrar produtos com valor igual a zero")
    public void testNaoEPermitidoRegistrarProdutoComValorIgualAZero(){
// Vou abrir o navegador
    WebDriver navegador = new ChromeDriver();
navegador.manage().window().maximize();
// Vou navegar para a pagina da lojinha web
    navegador.get("http://165.227.93.41/lojinha-web/v2");
    // Vou fazer login
    navegador.findElement(By.cssSelector("label[for=\"usuario\"]")).click();
    navegador.findElement(By.id("usuario")).sendKeys("admin");
    navegador.findElement(By.cssSelector("label[for=\"senha\"]")).click();
    navegador.findElement(By.id("senha")).sendKeys("admin");
    // Vou para a tela de registro de produto
    navegador.findElement(By.cssSelector("button[type=\"submit\"]")).click();
    navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
    // Vou preencher dados do produto e o valor será igual a zero
    navegador.findElement(By.id("produtonome")).sendKeys("Macbook Pro");
    navegador.findElement(By.id("produtovalor")).sendKeys("0,00");
    navegador.findElement(By.id("produtocores")).sendKeys("preto,branco");
    navegador.findElement(By.cssSelector("button[type = \"submit\"]")).click();

    // Vou submeter o formulario
    // Vou validar que a mensagem de erro foi apresentada
}
}
