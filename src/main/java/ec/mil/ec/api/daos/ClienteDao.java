package ec.mil.ec.api.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import ec.mil.ec.api.models.Cliente;

@Component
public class ClienteDao {
    
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Cliente getById(long id){
        String query = "SELECT id, nombre FROM Cliente where id="+id;
        Cliente cliente =  jdbcTemplate.queryForObject(query, new ClienteMapper());
        return cliente;
    }

}
