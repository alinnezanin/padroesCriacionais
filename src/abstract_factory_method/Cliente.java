package abstract_factory_method;

public class Cliente {

    private Botao botao;
    private CaixaTexto caixaTexto;

    public Cliente(GuiFactory factory){
        botao = factory.criarBotao();
        caixaTexto = factory.criarCaixaTexto();
    }
    public void construirTela(){
        botao.exibir();
        caixaTexto.renderizar();
    }

}
