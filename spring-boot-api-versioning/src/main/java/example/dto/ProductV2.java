package example.dto;

public class ProductV2 {
    private String name;
    private int price;

    public ProductV2(String name,int price){
        this.name=name;
        this.price=price;
    }

    public ProductV2(){}

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }
}
