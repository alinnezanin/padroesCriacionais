package criacionais.factory_method;

public abstract class Documento {

    public abstract void abrir();
    public abstract void salvar();
    public  void fechar(){
        System.out.println("fechar na classe pai");
    }

}
