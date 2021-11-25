package ec.mil.ec.api.daos;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import ec.mil.ec.api.models.Cliente;

public class ClienteMapper implements RowMapper<Cliente> {

    @Override
    public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
        Cliente cliente = new Cliente();
        cliente.setId(rs.getLong("id"));
        cliente.setNombre(rs.getString("nombre"));
        return cliente;
    }

}
