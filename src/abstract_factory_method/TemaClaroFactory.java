package abstract_factory_method;

public class TemaClaroFactory implements  GuiFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoClaro();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoClaro();
    }
}
