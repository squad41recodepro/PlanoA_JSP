package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Model.Professor;

public class ProfessorDAO {

	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Professor professor) {

		String sql = "INSERT INTO Professor (nome,cpf,formacao)" + " VALUES(?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, professor.getNome());

			pstm.setString(2, professor.getCpf());

			pstm.setString(3, professor.getFormacao());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void removeById(int idProfessor) {

		String sql = "DELETE FROM Professor WHERE idProfessor = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idProfessor);
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public void update(Professor professor) {
		String sql = "UPDATE Professor SET nome = ?,cpf=?, formacao=?" + "WHERE idProfessor = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, professor.getNome());
			pstm.setString(2, professor.getCpf());
			pstm.setString(3, professor.getFormacao());

			pstm.setInt(4, professor.getIdProfessor());
			pstm.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public List<Professor> getProfessores() {

		String sql = "SELECT * FROM Professor";

		List<Professor> professores = new ArrayList<Professor>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				Professor professor = new Professor();

				professor.setIdProfessor(rset.getInt("idProfessor"));

				professor.setNome(rset.getString("nome"));

				professor.setCpf(rset.getString("cpf"));

				professor.setFormacao(rset.getString("formacao"));

				professores.add(professor);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return professores;
	}

	public Professor getProfessorById(int idProfessor) {

		String sql = "SELECT * FROM professor where idProfessor = ?";
		Professor professor = new Professor();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idProfessor);
			rset = pstm.executeQuery();

			rset.next();

			professor.setNome(rset.getString("nome"));

			professor.setCpf(rset.getString("cpf"));

			professor.setFormacao(rset.getString("formacao"));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return professor;
	}

}
