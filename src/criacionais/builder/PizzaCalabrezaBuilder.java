package criacionais.builder;

public class PizzaCalabrezaBuilder extends PizzaBuilder{
    @Override
    public void massaBuilder() {
        pizza.setMassa("Integral");
    }

    @Override
    public void molhoBuilder() {
        pizza.setMolho("Molho Tomate");
    }

    @Override
    public void coberturaBuilder() {
        pizza.setCobertura("Cebola, Calabreza, Queijo");
    }

    @Override
    public void bordaBuilder() {
        pizza.setBorda("Catupiry");
    }

}
