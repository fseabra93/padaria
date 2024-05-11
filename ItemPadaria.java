/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padaria;
/**
 *
 * @author flaviorgs
 */
public class ItemPadaria {
    
    private String nome;
    public String condicao;

    public ItemPadaria(String nome) {
        this.nome = nome;
        this.condicao = "";
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }
    
    
    @Override
    public String toString() {
        if (condicao.length() == 0){
            return "Item: " + nome;
        } else {
            return "O item " + nome + " encontra-se " + condicao +".";
        } 
    }

    @Override
    public boolean equals(Object o) {
        
       return o instanceof ItemPadaria && this.nome.equals(((ItemPadaria)o).getNome());
       
    }


}
