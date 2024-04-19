package abstract_factory_method;

public class TemaEscuroFactory implements  GuiFactory{
    @Override
    public Botao criarBotao() {
        return new BotaoEscuro();
    }

    @Override
    public CaixaTexto criarCaixaTexto() {
        return new CaixaTextoEscuro();
    }
}
