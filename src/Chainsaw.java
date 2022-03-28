public class Chainsaw extends ConstructionTool{
    public Chainsaw() {
        super.name = "Chainsaw";
        super.constructionToolType = "Petrol";
    }

    @Override
    public void makeSomething() {
        System.out.println(name + " to saw");
    }

    @Override
    public void doSomething() {
        System.out.println(name + " is working");
    }
}
