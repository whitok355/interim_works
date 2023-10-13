package interim_works;
public class Toy {
    
    private int id;
    private String name;
    private int weight;
    private int quantity;
    private int res;

    public Toy(int id, String name, int weight, int quantity, int res){
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.quantity = quantity;
        this.res = res;
    }

    public Toy getToy(){
        return this;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setWeight(int newWeight){
        this.weight = newWeight;
    }
    public int getWeight(){
        return weight;
    }
    public int getRes(){
        return res;
    }
    public void setRes(int newValue){
        res = newValue;
    }
    @Override
    public String toString(){
        return String.format("id: %s, наименование: %s, шанс выпадания: %s, в наличие: %s штук, рузальтат: %s", id, name, weight, quantity, res);
    }
}
