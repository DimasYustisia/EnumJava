
package enumjava;

public class EnumJava {


    public static void main(String[] args) {
 
     usandoConstantes();
       
        System.out.println("");
        
        usandoEnum();
    }
    
    private static void usandoConstantes(){
    
        int segunda = DiaSemanaConstante.SEGUNDA;
        int terca = DiaSemanaConstante.TERCA;
        int quarta = DiaSemanaConstante.QUARTA;
        int quinta = DiaSemanaConstante.QUINTA;
        int sexta = DiaSemanaConstante.SEXTA;
        int sabado = DiaSemanaConstante.SABADO;
        int domingo = DiaSemanaConstante.DOMINGO;
        
        System.out.println("Teste utilizando constantes no java");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
        
    }
    
    private static void imprimiDiaSemana(int dia){
        switch(dia){
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabado-Feira");
                break;
            case 7:
                System.out.println("Domingo-Feira");
                break;        
                
       } 
    }
    
    private static void usandoEnum(){
    
        DiaSemana segunda = DiaSemana.SEGUNDA;
        DiaSemana terca = DiaSemana.TERCA;
        DiaSemana quarta = DiaSemana.QUARTA;
        DiaSemana quinta = DiaSemana.QUINTA;
        DiaSemana sexta = DiaSemana.SEXTA;
        DiaSemana sabado = DiaSemana.SABADO;
        DiaSemana domingo = DiaSemana.DOMINGO;
        
        System.out.println("Teste utilizando enum no java");
        imprimiDiaSemana(segunda);
        imprimiDiaSemana(terca);
        imprimiDiaSemana(quarta);
        imprimiDiaSemana(quinta);
        imprimiDiaSemana(sexta);
        imprimiDiaSemana(sabado);
        imprimiDiaSemana(domingo);
        
    }
    
    private static void imprimiDiaSemana(DiaSemana dia){
        switch(dia){
            case SEGUNDA:
                System.out.println("Segunda-Feira");
                break;
            case TERCA:
                System.out.println("Terça-Feira");
                break;
            case QUARTA:
                System.out.println("Quarta-Feira");
                break;
            case QUINTA:
                System.out.println("Quinta-Feira");
                break;
            case SEXTA:
                System.out.println("Sexta-Feira");
                break;
            case SABADO:
                System.out.println("Sabado-Feira");
                break;
            case DOMINGO:
                System.out.println("Domingo-Feira");
                break;        
                
       } 
    }
 
    //EXEMPLO 2 DE ENUM
    
    /*    DiaSemana dia = DiaSemana.DOMINGO;
   
        System.out.println(dia.toString()+" - "+dia.getValor());
   
   
        Data data = new Data(1, 4, 2016, DiaSemana.SEXTA);
    }
}*/
    //EXEMPLO DE ENUM COM MÉTODOS VALUE E VALUEOF
    /*    System.out.println("Método Value\n");
        DiaSemana[] dias = DiaSemana.values();
        
        for (int i=0; i<dias.length; i++){
            System.out.println(dias[i]);
        }
        
        for(DiaSemana dia : DiaSemana.values()){
            System.out.println(dia);
        }
    
        System.out.println("\nMétodo ValueOf \n");
        System.out.println(Enum.valueOf(DiaSemana.class, "DOMINGO"));
        
        DiaSemana dia = Enum.valueOf(DiaSemana.class, "DOMINGO");
        
        System.out.println(dia);
    
    }

}*/
    
//TESTE DOCUMENTO
        /*for(TipoDocumento doc : TipoDocumento.values()){
            System.out.println(doc + " - " + doc.gerarNumeroTeste());
        }*/
        
        /*Pessoa pf = new Pessoa();
        pf.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CPF"));
        pf.serNumeroDocumento(pf.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pf);
        
        Pessoa pj = new Pessoa();
        pj.setTipoDocumento(Enum.valueOf(TipoDocumento.class, "CNPJ"));
        pj.serNumeroDocumento(pj.getTipoDocumento().gerarNumeroTeste());
        System.out.println(pj);
    }
}*/
