/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import ice.cream.pattern.Acai;

/**
 *
 * @author Uillian
 */
public interface IFactoryAbstract {
     public Acai buildAcai(String listaAdicionais); 
}
