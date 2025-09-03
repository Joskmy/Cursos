package com.platzi.pizzeria.web.controller;

import com.platzi.pizzeria.persistence.entity.PizzaEntity;
import com.platzi.pizzeria.service.PizzaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {
    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping
    public ResponseEntity<List<PizzaEntity>> getAll() {
        return ResponseEntity.ok(this.pizzaService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PizzaEntity> get(@PathVariable int id) {
        return ResponseEntity.ok(this.pizzaService.get(id));
    }

    @PostMapping
    public ResponseEntity<PizzaEntity> save(@RequestBody PizzaEntity pizza) {
        return ResponseEntity.ok(this.pizzaService.save(pizza));
    }

    @PutMapping
    public ResponseEntity<PizzaEntity> update(@RequestBody PizzaEntity pizza) {
        if (!this.pizzaService.existsById(pizza.getId())) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(this.pizzaService.update(pizza));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        if (!this.pizzaService.existsById(id)) {
            return ResponseEntity.badRequest().build();
        }
        this.pizzaService.delete(id);
        return ResponseEntity.ok().build();
    }
}
