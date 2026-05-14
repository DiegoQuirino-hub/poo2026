import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente) {
        Cliente created = service.criar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        Optional<Cliente> clienteOpt = service.buscarPorId(id);
        if (clienteOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {
        Optional<Cliente> clienteOpt = service.buscarPorId(id);
        if (clienteOpt.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        cliente.setId(id);
        Cliente updated = service.atualizar(cliente);
        return ResponseEntity.ok(updated);
    }
}