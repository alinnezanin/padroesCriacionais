package estruturais.adapter;

public class ConexaoRedonda {

    private Double raio;


    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public boolean verificarConexao(PinoRedondo pinos){

        return (this.raio >= pinos.getRaio());


    }



}
