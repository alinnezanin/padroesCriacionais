package criacionais.factory_method;

public class Relatorio extends Documento{

    public void abrir(){
        System.out.println("Abrindo relatório");
    }

    public void salvar(){
        System.out.println("Salvando Relatório");
    }

    public void fechar(){
        System.out.println("Fechando Relatório");
    }
}
