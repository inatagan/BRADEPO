public class ValidaEstoque implements IValidaEstoque {
	private int qtde;
    // private boolean valida;

    public void ValidaEstoque(int qtde){
        this.qtde = qtde;
    }

    public boolean EstoqueValido(int qtde) {
        if (qtde > 0) {
            return true;
        }
        else return false;
    }

    @Override
    public void connect(IProcessarPedido component){
        component.update(this.EstoqueValido(qtde));
    }
}
