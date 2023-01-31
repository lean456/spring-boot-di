package com.example.di.springbootdi.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//@Service("miServicioComplejo")
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion(){
    return "ejecutando proceso complejo";
    }
}
