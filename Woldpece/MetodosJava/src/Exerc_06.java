import javax.swing.JOptionPane;

public class Exerc_06 {
	
	public static int HoraPMparaAM(int hora) {
		int listaHora [] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int novaHora = listaHora[(hora%12)-1];		
		return novaHora;			
	}
	
	public static int HoraAMparaPM(int hora) {
		int novaHora = hora%12;		
		return novaHora;	
		
	}
	public static void main(String[]args) {
		String horas = JOptionPane.showInputDialog("Informe hora para conversão ");
		String entrada [] = horas.split(":");
		int hora = Integer.parseInt(entrada[0]);
		
		if(hora > 12 && hora < 25) {
			int NovaHora = HoraPMparaAM(hora);
			JOptionPane.showMessageDialog(null,NovaHora+":"+entrada[1]+" Hora convertida");
		}else if(hora >= 1 && hora <= 12) {
			int NovaHora = HoraAMparaPM(hora);
			JOptionPane.showMessageDialog(null,NovaHora+":"+entrada[1]+" Hora convertida");
		}else {
			JOptionPane.showMessageDialog(null, "Desculpe\nHora informada\nNão suportada");
		}
		
	}
}