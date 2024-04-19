package abstract_factory_method;

public class CaixaTextoClaro implements CaixaTexto{
    @Override
    public void renderizar() {
        System.out.println("Renderizando Caixa texto Claro");
    }
}
