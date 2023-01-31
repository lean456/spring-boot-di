package com.example.di.springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//@Primary
//@Service("miServicioPrincipal")
public class MiServicio implements IServicio{
    @Override
    public String operacion(){
    return "ejecutando algun proceso";
    }
}
