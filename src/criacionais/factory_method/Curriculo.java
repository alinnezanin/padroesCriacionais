package criacionais.factory_method;

public class Curriculo extends Documento {

    public void abrir(){
        System.out.println("Abrindo curriculo");
    }
    public void fechar(){
        System.out.println("Fechando curriculo");
    }
    public void salvar(){
        System.out.println("Salvando curriculo");
    }
}
