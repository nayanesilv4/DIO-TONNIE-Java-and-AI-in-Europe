package com.dio.ProductsAPI;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/products")
@Tag(name = "Produtos", description = "Gerenciamento de produtos")
public class ProductController {

    private Map<Long, Product> products = new HashMap<>();
    private Long idCounter = 1L;

    @GetMapping
    @Operation(summary = "Listar todos os produtos", description = "Retorna a lista de todos os produtos cadastrados.")
    public Collection<Product> list() {
        return products.values();
    }

    @PostMapping
    @Operation(summary = "Criar um produto", description = "Adiciona um novo produto com nome e preço.")
    public Product create(@RequestBody Product product) {
        product.setId(idCounter++);
        products.put(product.getId(), product);
        return product;
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualizar um produto", description = "Atualiza os dados de um produto existente pelo ID.")
    public Product update(@PathVariable Long id, @RequestBody Product updatedProduct) {
        if (!products.containsKey(id)) {
            throw new RuntimeException("Product not found");
        }
        updatedProduct.setId(id);
        products.put(id, updatedProduct);
        return updatedProduct;
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deletar um produto", description = "Remove um produto pelo ID.")
    public String delete(@PathVariable Long id) {
        if (!products.containsKey(id)) {
            throw new RuntimeException("Product not found");
        }
        products.remove(id);
        return "Product with ID " + id + " deleted successfully";
    }

   }
