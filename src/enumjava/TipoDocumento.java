package enumjava;


public enum TipoDocumento {
    
    CPF{
        @Override
        public String gerarNumeroTeste() {
            return GerarCpfCnpj.cpf();
        }
  
    }, CPNJ{
        @Override
        public String gerarNumeroTeste() {
            return GerarCpfCnpj.cnpj();
        }
    };
    
    public abstract String gerarNumeroTeste();
    
}
