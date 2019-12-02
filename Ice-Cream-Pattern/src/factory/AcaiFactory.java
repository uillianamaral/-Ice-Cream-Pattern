/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import builder.AcaiBuilder;
import ice.cream.pattern.Acai;

/**
 *
 * @author Uillian
 */
public class AcaiFactory implements IFactoryAbstract{

    @Override
    public Acai buildAcai(String listaAdicionais) {
        if(listaAdicionais.equalsIgnoreCase("Tradicional")){
            return new AcaiBuilder()
                    .temMorango(true)
                    .temLeiteCondensado(true)
                    .temNinho(true)
                    .build();
        }else if(listaAdicionais.equalsIgnoreCase("Ninho")){
            return new AcaiBuilder()
                    .temNinho(true)
                    .temSonhoDeSalsa(true)
                    .temLeiteCondensado(true)
                    .build();
        } else if(listaAdicionais.equalsIgnoreCase("Especial")){
            return new AcaiBuilder()
                    .temBanana(true)
                    .temNutela(true)
                    .temBiz(true)
                    .temNinho(true)
                    .temBiz(true)
                    .build();
        }
        
        return new AcaiBuilder()
                .isNome("Biz")
                .temMorango(true)
                .temBiz(true)
                .temLeiteCondensado(true)
                .build();
    }
        
}
