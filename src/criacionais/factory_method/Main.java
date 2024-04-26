package criacionais.factory_method;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        ProcessadorTexto word = new ProcessadorTexto();
        Documento relatorio = word.novoDocumento("relatorio");
        Documento curriculo = word.novoDocumento("curriculo");

        relatorio.salvar();
        curriculo.salvar();

    }


}