package example.api;

import example.dto.ProductV1;
import example.dto.ProductV2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    // URI Versioning
    //http://localhost:8080/api/v1/product
    @GetMapping("/v1/product")
    public ResponseEntity<ProductV1> pathVersioningProductV1(){
        return ResponseEntity.of(Optional.of(new ProductV1("Laptop")));
    }

    //http://localhost:8080/api/v1/product
    @GetMapping("/v2/product")
    public ResponseEntity<ProductV2> pathVersioningProductV2(){
        return ResponseEntity.of(Optional.of(new ProductV2("Laptop",1000)));
    }


    // Header Versioning
    //http://localhost:8080/api/product
    @GetMapping(value = "/product" ,headers = "X-API-VERSION=1")
    public ResponseEntity<ProductV1> headerVersioningProductV1(){
        return ResponseEntity.of(Optional.of(new ProductV1("Laptop")));
    }

    //http://localhost:8080/api/product
    @GetMapping(value = "/product",headers = "X-API-VERSION=2")
    public ResponseEntity<ProductV2> headerVersioningProductV2(){
        return ResponseEntity.of(Optional.of(new ProductV2("Laptop",1000)));
    }
}
