/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

import ice.cream.pattern.Acai;

/**
 *
 * @author Uillian
 */
public class Fazendo implements IStatusPedido{

    Acai acai;
    
    @Override
    public void statusPedido(Acai acai) {
        this.acai = acai;
        this.acai.setStatus("Estamos fazendo seu pedido");
    }
    
}
