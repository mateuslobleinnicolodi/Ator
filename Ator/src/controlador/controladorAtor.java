package controlador;
import dao.AtorDao;
import javax.swing.JOptionPane;
import modelo.Ator;
import tela.manutencao.Manutencao_Ator;

public class controladorAtor {
    public static void inserir(Manutencao_Ator man){
        Ator objeto = new Ator();
        objeto.setNome_real(man.jtfNome_real.getText());
        objeto.setNome_art(man.jtfNome_art.getText());
        
        boolean resultado = AtorDao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
}
