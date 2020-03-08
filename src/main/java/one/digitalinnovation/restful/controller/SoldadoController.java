package one.digitalinnovation.restful.controller;

import one.digitalinnovation.restful.entity.SoldadoEntity;
import one.digitalinnovation.restful.service.SoldadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/soldado")
public class SoldadoController {
    @Autowired
    private SoldadoService soldadoService;

    @GetMapping("/{cpf}")
    public ResponseEntity<SoldadoEntity> buscarSoldado(@PathVariable(value = "cpf") final String cpf) {
        return ResponseEntity.ok(soldadoService.buscarSoldado(cpf));
    }

    @GetMapping
    public ResponseEntity<List<SoldadoEntity>> buscarSoldados() {
        return ResponseEntity.ok(soldadoService.buscarSoldados());
    }

    @PostMapping
    public ResponseEntity<SoldadoEntity> criarSoldado(@RequestBody SoldadoEntity soldado) {
        soldadoService.criarSoldado(soldado);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{cpf}")
    public ResponseEntity editarSoldado(@PathVariable(value = "cpf") final String cpf, @RequestBody SoldadoEntity soldado) {
        soldadoService.alterarSoldado(cpf, soldado);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity deletarSoldado(@PathVariable(value = "cpf") final String cpf) {
        soldadoService.deletarSoldado(cpf);
        return ResponseEntity.ok().build();
    }
}
