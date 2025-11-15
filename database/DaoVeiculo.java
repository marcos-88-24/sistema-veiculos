
package br.com.fecaf.database;

import br.com.fecaf.model.MarcaModelo;
import br.com.fecaf.model.Veiculo;

import java.sql.*;
import java.util.ArrayList;

public class DaoVeiculo {

    public void cadastrar(Veiculo v) {
        String sql = "INSERT INTO veiculo (marca_modelo_id, ano, cor, preco, km, status) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, v.getMarcaModelo().getId());
            stmt.setInt(2, v.getAno());
            stmt.setString(3, v.getCor());
            stmt.setDouble(4, v.getPreco());
            stmt.setInt(5, v.getKm());
            stmt.setString(6, v.getStatus());

            stmt.execute();
            System.out.println("Veículo cadastrado!");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
        }
    }


    public ArrayList<Veiculo> listar() {
        ArrayList<Veiculo> lista = new ArrayList<>();
        String sql = "SELECT v.*, m.marca, m.modelo FROM veiculo v JOIN marca_modelo m ON v.marca_modelo_id = m.id";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                MarcaModelo mm = new MarcaModelo(
                        rs.getInt("marca_modelo_id"),
                        rs.getString("marca"),
                        rs.getString("modelo")
                );

                Veiculo v = new Veiculo(
                        rs.getInt("id"),
                        mm,
                        rs.getInt("ano"),
                        rs.getString("cor"),
                        rs.getDouble("preco"),
                        rs.getInt("km"),
                        rs.getString("status")
                );

                lista.add(v);
            }

        } catch (Exception e) {
            System.out.println("Erro ao listar: " + e.getMessage());
        }
        return lista;
    }


    public void atualizar(Veiculo v) {
        String sql = "UPDATE veiculo SET preco=?, km=?, status=? WHERE id=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setDouble(1, v.getPreco());
            stmt.setInt(2, v.getKm());
            stmt.setString(3, v.getStatus());
            stmt.setInt(4, v.getId());

            stmt.execute();
            System.out.println("Veículo atualizado!");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar: " + e.getMessage());
        }
    }


    public void remover(int id) {
        String sql = "DELETE FROM veiculo WHERE id=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.execute();
            System.out.println("Veículo removido!");
        } catch (Exception e) {
            System.out.println("Erro ao remover: " + e.getMessage());
        }
    }
}
