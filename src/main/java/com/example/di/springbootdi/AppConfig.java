package com.example.di.springbootdi;

import com.example.di.springbootdi.models.domain.ItemFactura;
import com.example.di.springbootdi.models.domain.Producto;
import com.example.di.springbootdi.models.services.IServicio;
import com.example.di.springbootdi.models.services.MiServicio;
import com.example.di.springbootdi.models.services.MiServicioComplejo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean("miServicioPrincipal")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }
    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    @Primary
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("libro esquirla",250);
        Producto producto2 = new Producto("llavero cosmere",9);

        ItemFactura lista1 = new ItemFactura(producto1,2);
        ItemFactura lista2 = new ItemFactura(producto2,6);
        return Arrays.asList(lista1,lista2);
    }
    @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto1 = new Producto("monitor oficina",1200);
        Producto producto2 = new Producto("notebook",500);
        Producto producto3 = new Producto("impresora",0);
        Producto producto4 = new Producto("teclado",99);

        ItemFactura lista1 = new ItemFactura(producto1,2);
        ItemFactura lista2 = new ItemFactura(producto2,6);
        ItemFactura lista3 = new ItemFactura(producto3,10);
        ItemFactura lista4 = new ItemFactura(producto4,12);
        return Arrays.asList(lista1,lista2,lista3,lista4);
    }
}
