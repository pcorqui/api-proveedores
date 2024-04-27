package com.cristmol.apiproveedores.service;

import com.cristmol.apiproveedores.entities.Proveedor;
import com.cristmol.apiproveedores.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorService {

    @Autowired
    ProveedorRepository proveedorRepository;

    public List<Proveedor> findall(){
        return (List<Proveedor>) proveedorRepository.findAll();
    }

    public Proveedor saveProveedor(Proveedor p){
        Proveedor proveedor = proveedorRepository.findByName(p.getName());
        if(proveedor!=null){
            throw  new RuntimeException("El proveedor ya existe");
        }
        return proveedorRepository.save(p);
    }

    public void deleteProveedor(long id){
        proveedorRepository.deleteById(id);
    }
}
