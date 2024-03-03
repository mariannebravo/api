package med.voll.api.controller;

import med.voll.api.product.ProductsDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/products")
public class ProductsController {

  @PostMapping()
  public void registerProducts(@RequestBody ProductsDTO data) {
    System.out.println(data);
  }
}
