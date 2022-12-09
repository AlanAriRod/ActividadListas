
public class ListaNumeros {

private int numero;
	
	// Constructor
	public ListaNumeros(int numero) {
		this.numero = numero;
	}
	
	// Métodos getter y setter
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return ""+numero;
	}
/*	
	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + numero;
        return result;
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Numeros other = (Numeros) obj;
        if (numero != other.numero)
            return false;
        return true;
    }
*/
}
