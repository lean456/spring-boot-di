package com.example.di.springbootdi.models.services;

import org.springframework.stereotype.Service;

@Service("miServicioPrincipal")
public class MiServicio implements IServicio{
    @Override
    public String operacion(){
    return "ejecutando algun proceso";
    }
}
