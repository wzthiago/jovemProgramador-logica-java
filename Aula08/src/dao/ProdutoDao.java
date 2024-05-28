package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

import entidades.Produto;

public class ProdutoDao {

	public Connection getConexao() throws ClassNotFoundException {

		// Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		Class.forName(driver);

		// Endereço do banco de dados
		String url = "jdbc:mysql://localhost:3306/jovem_programador";

		// Usuário
		String user = "root";

		// Senha
		String password = "root";

		Connection conn = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão realizada com Sucesso");
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return conn;
	}

	public int inserirProduto(Produto produtoNovo) {

		// SQL
		String insert = "INSERT INTO" + "produtos(nome, marca, preco, quantidade, data, categoria)"
				+ "VALUES (?,?,?,?,?,?)";

		try {
			Connection conn = getConexao();

			PreparedStatement pst = conn.prepareStatement(insert, java.sql.Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, produtoNovo.getNome());
			pst.setString(2, produtoNovo.getMarca());
			pst.setDouble(3, produtoNovo.getPreco());
			pst.setInt(4, produtoNovo.getQuantidade());
			pst.setDate(5, produtoNovo.getDate());
			pst.setString(6, produtoNovo.getCategoria());
			
			// Executa consulta
			pst.executeUpdate();
					
			

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

}
