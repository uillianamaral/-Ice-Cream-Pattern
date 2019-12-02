/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice.cream.pattern;

import state.Fazendo;
import state.IStatusPedido;
import state.Pronto;

/**
 *
 * @author Uillian
 */
public class Sorveteria {
    
    IStatusPedido iStatusPedido;
    
    public void statusPedido(String status, Acai acai){
        if(status.equalsIgnoreCase("Fazendo")){
            this.iStatusPedido = new Fazendo();
            this.iStatusPedido.statusPedido(acai);
        }else if(status.equalsIgnoreCase("Pronto")){
            this.iStatusPedido = new Pronto();
            this.iStatusPedido.statusPedido(acai);
        }
        this.iStatusPedido.statusPedido(acai);
    }
    
}
