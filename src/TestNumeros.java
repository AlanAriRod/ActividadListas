

import javax.swing.JOptionPane;
import ed.ito.*;

public class TestNumeros {

	static ListaDinamica<ListaNumeros> num = new ListaDinamica<ListaNumeros>(20);
	
	static int menu() {
		int opc = 0;
        String[] datos = {
        	"1) Agregar numero",
            "2) Primer n�mero de la lista",
            "3) Ultimo n�mero de la lista",
            "4) Cantidad de numeros",
            "5) Eliminar primer n�mero de la lista",
            "6) Eliminar ultimo n�mero de la lista",
            "7) Limpiar la lista",
            "8) Buscar n�mero en lista",
            "9) Terminar el programa"
        };
        
        String x = (String)JOptionPane.showInputDialog(null,"Seleccione uno", "Menu",
        JOptionPane.INFORMATION_MESSAGE, null,datos,datos[0]);
        opc = Integer.parseInt(x.charAt(0)+"");
        return opc;
	}
	
	static void llegada() {
		ListaNumeros numero = new ListaNumeros(0);
		numero.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un n�mero a la lista: ")));
		try {
			num.add(numero);
		} catch(ExcepcionDeListaLlena e) {
            System.err.println(e.getMessage());
		}
	}

	static void primero() {
		try {
			ListaNumeros numero = num.first();
	        JOptionPane.showMessageDialog(null, numero, "Primer n�mero", 0);
		} catch(ExcepcionDeListaVacia e){
            System.err.println(e.getMessage());
        }
	}

	static void ultimo() {
		try {
			ListaNumeros numero = num.last();
			JOptionPane.showMessageDialog(null, numero, "�ltimo n�mero", 0);
		} catch(ExcepcionDeListaVacia e){
			System.err.println(e.getMessage());
		}
	}

	static void cantidad() {
		JOptionPane.showMessageDialog(null, "Cantidad de numeros en la lista: [ "+num.size()+" ]", "Total de piezas", 0);
	}

	static void eliminaPrimerNum() {
		try {
			ListaNumeros numero = num.deleteFirst();
			JOptionPane.showMessageDialog(null, "El primer n�mero ( "+numero+" ) ha sido elimidado correctamente", "Eliminar primer n�mero", 0);
		} catch(ExcepcionDeListaVacia e) {
			System.err.println(e.getMessage());
		}
	}

	static void eliminaUltimoNum() {
		try {
			ListaNumeros numero = num.deleteLast();
			JOptionPane.showMessageDialog(null, "El �ltimo n�mero ( "+numero+" ) ha sido elimidado correctamente", "Eliminar �ltimo n�mero", 0);
		} catch(ExcepcionDeListaVacia e) {
			System.err.println(e.getMessage());
		}
	}

	static void buscar(){
		ListaNumeros numero = new ListaNumeros(0);
        numero.setNumero(Integer.parseInt(JOptionPane.showInputDialog(null, "Proporciona n�mero a buscar:")));
        int i = num.search(numero);
        if(i==-1)
           JOptionPane.showMessageDialog(null, "No se localiza dicho n�mero");
        else
           JOptionPane.showMessageDialog(null, numero+"\nSe localiza en la posici�n: "+i);
    }

	static void run() {
        boolean salir = false;
        while(!salir){
            switch(menu()) {
            	case 1: llegada(); break;
            	case 2: primero(); break;
            	case 3: ultimo(); break;
            	case 4: cantidad(); break;
            	case 5: eliminaPrimerNum(); break;
            	case 6: eliminaUltimoNum(); break;
            	case 7: num.clear(); break;
            	case 8: buscar(); break;
                case 9: salir = true;
            }
        }
    }
	
	public static void main(String[] args) {
		run();
	}

}
