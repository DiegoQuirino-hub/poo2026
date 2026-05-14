import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();
    private Long nextId = 1L;

    public List<Cliente> listar() {
        return new ArrayList<>(clientes);
    }

    public Cliente criar(Cliente c) {
        c.setId(nextId++);
        clientes.add(c);
        return c;
    }

    public Cliente buscarPorId(Long id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void remover(Long id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }

    public Cliente atualizar(Long id, Cliente novo) {
        Cliente existing = buscarPorId(id);
        if (existing != null) {
            novo.setId(id);
            clientes.removeIf(cliente -> cliente.getId().equals(id));
            clientes.add(novo);
            return novo;
        }
        return null;
    }
}