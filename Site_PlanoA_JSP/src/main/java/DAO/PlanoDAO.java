package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Conexao.Conexao;
import Model.Plano;

public class PlanoDAO {
	
	Connection conn = null;
	PreparedStatement pstm = null;

	public void save(Plano plano) {

		String sql = "INSERT INTO plano (nomeDaAula,materia,serie)" + " VALUES(?,?,?)";

		try {
			conn = Conexao.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, plano.getNomeDaAula());

			pstm.setString(2, plano.getMateria());

			pstm.setString(3, plano.getSerie());

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

	public void removeById(int idPlano) {

		String sql = "DELETE FROM plano WHERE idPlano = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPlano);
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

	public void update(Plano plano) {
		String sql = "UPDATE plano SET nomeDaAula = ?,materia=?, serie=?" + "WHERE idPlano = ?";

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, plano.getNomeDaAula());
			pstm.setString(2, plano.getMateria());
			pstm.setString(3, plano.getSerie());

			pstm.setInt(4, plano.getIdPlano());
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

	public List<Plano> getPlanos() {

		String sql = "SELECT * FROM Plano";

		List<Plano> planos = new ArrayList<Plano>();

		ResultSet rset = null;
		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();

			while (rset.next()) {

				Plano plano = new Plano();

				plano.setIdPlano(rset.getInt("idPlano"));

				plano.setNomeDaAula(rset.getString("nomeDaAula"));

				plano.setMateria(rset.getString("materia"));

				plano.setSerie(rset.getString("serie"));

				planos.add(plano);
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
		return planos;
	}

	public Plano getPlanoById(int idPlano) {

		String sql = "SELECT * FROM plano where idPlano = ?";
		Plano plano = new Plano();

		ResultSet rset = null;

		try {
			conn = Conexao.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, idPlano);
			rset = pstm.executeQuery();

			rset.next();

			plano.setNomeDaAula(rset.getString("nomeDaAula"));

			plano.setMateria(rset.getString("materia"));

			plano.setSerie(rset.getString("serie"));

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
		return plano;
	}


}
