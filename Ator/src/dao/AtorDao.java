package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Ator;

public class AtorDao {
    public static boolean inserir(Ator objeto) {
        String sql = "INSERT INTO Ator (nome_real, nome_art) VALUES (?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_real());
            ps.setString(2, objeto.getNome_art());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static void main(String[] args) {
        Ator objeto = new Ator();
        objeto.setNome_real("Mateus");
        objeto.setNome_art("Batman");
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
    
    public static boolean alterar(Ator objeto) {
        String sql = "UPDATE Ator SET nome_real = ?, nome_art = ? WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_real()); 
            ps.setString(2, objeto.getNome_art());
            ps.setInt(3, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean excluir(Ator objeto) {
        String sql = "DELETE FROM Ator WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setInt(1, objeto.getCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
