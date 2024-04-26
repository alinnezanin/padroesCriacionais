package estruturais.adapter;

public class Main {

    public static void main(String[] args) {

        PinoRedondo pino = new PinoRedondo();
        ConexaoRedonda conexao = new ConexaoRedonda();
        pino.setRaio(5.0);
        conexao.setRaio(5.0);

        if(conexao.verificarConexao(pino)){
            System.out.println("Foi possivel conectar o pino redondo");
        }

        PinoPlano pinoPlanoPequeno = new PinoPlano();
        PinoPlano pinoPlanoGrande = new PinoPlano();
        pinoPlanoPequeno.setLargura(9.0);
        pinoPlanoGrande.setLargura(52.0);

        PinoPlanoAdapter adapter = new PinoPlanoAdapter(pinoPlanoPequeno);
       adapter.setRaio(pinoPlanoPequeno.getLargura()/2);

        if(conexao.verificarConexao(adapter)){
            System.out.println("Foi possivel conectar o pino " +
                    "plano pequeno na conexão redonda");
        }

        PinoPlanoAdapter adapterPlanoMaior =
                new PinoPlanoAdapter(pinoPlanoGrande);

        adapter.setRaio(pinoPlanoGrande.getLargura()/2);


        if(!conexao.verificarConexao(adapterPlanoMaior)){
            System.out.println("Não possivel conectar o pino " +
                    "plano maior na conexão redonda");
        }






    }
}
