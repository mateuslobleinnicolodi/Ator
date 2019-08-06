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

    public static void alterar(Manutencao_Ator man){
        Ator objeto = new Ator();
        //definir todos os atributos
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText()));
        objeto.setNome_real(man.jtfNome_real.getText());
        objeto.setNome_art(man.jtfNome_art.getText());
        
        boolean resultado = AtorDao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void excluir(Manutencao_Ator man){
        Ator objeto = new Ator();
        objeto.setCodigo(Integer.parseInt(man.jtfCodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = AtorDao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
