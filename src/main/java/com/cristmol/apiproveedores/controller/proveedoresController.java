package com.cristmol.apiproveedores.controller;

import com.cristmol.apiproveedores.entities.Proveedor;
import com.cristmol.apiproveedores.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class proveedoresController {

    @Autowired
    ProveedorService proveedoresService;

    @CrossOrigin(origins = "http://localhost:52912")
    @GetMapping("/listar")
    public List<Proveedor> listar(){
        return proveedoresService.findall();
    }

    @PostMapping
    public Proveedor addProveedor(@RequestBody Proveedor proveedor){
        return proveedoresService.saveProveedor(proveedor);
    }

    @DeleteMapping("/{id}")
    public void deleteProveedor(@PathVariable long id){
        proveedoresService.deleteProveedor(id);
    }
}
