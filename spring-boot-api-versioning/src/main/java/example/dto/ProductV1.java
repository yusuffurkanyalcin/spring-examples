package example.dto;

import java.lang.ref.PhantomReference;

public class ProductV1 {
    private String name;

    public ProductV1(String name){
        this.name=name;
    }
    public ProductV1(){}
    public String getName(){
        return name;
    }
}
