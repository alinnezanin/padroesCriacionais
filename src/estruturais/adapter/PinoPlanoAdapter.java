package estruturais.adapter;

public class PinoPlanoAdapter extends PinoRedondo{

    private PinoPlano pino;

    public PinoPlanoAdapter(PinoPlano pino){
        this.pino = pino;
    }

    public PinoPlano getPino() {
        return pino;
    }

    public void setPino(PinoPlano pino) {
        this.pino = pino;
    }

    @Override
    public Double getRaio() {
        return pino.getLargura();
    }

    public void setRaio(Double raio) {
        this.pino.setLargura(raio);
    }




}
