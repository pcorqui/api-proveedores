package com.cristmol.apiproveedores.repository;

import com.cristmol.apiproveedores.entities.Proveedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends CrudRepository<Proveedor, Long> {

    Proveedor findByName(String name);
}
