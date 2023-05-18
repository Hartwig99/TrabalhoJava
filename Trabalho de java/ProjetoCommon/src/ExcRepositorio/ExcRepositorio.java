package ExcRepositorio;
import javax.swing.JOptionPane;

public class ExcRepositorio extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcRepositorio(String mensagem) {
		JOptionPane.showMessageDialog(null, mensagem, "Erro:", 
				JOptionPane.INFORMATION_MESSAGE);
	}
}
