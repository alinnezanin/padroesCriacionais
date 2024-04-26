package criacionais.abstract_factory_method;

public class CaixaTextoEscuro implements CaixaTexto{
    @Override
    public void renderizar() {
        System.out.println("Renderizando Caixa texto escuro");
    }
}
