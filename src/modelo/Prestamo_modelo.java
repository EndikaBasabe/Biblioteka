package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Prestamo_modelo extends Conector{

	
	public Prestamo_modelo(String dbIzena) {
		super(dbIzena);
	}

	
	public ArrayList<Prestamo> select() {
		ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
		try {
			Statement st = this.conexion.createStatement();
			ResultSet rs = st.executeQuery("select * from prestamos");
			while (rs.next()) {
				prestamos.add(new Prestamo(rs.getInt("id_libro"), rs.getInt("id_socio"), rs.getDate("fecha"),
						rs.getBoolean("devuelto")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prestamos;
	}
}
