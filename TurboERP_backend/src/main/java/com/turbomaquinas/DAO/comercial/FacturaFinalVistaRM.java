package com.turbomaquinas.DAO.comercial;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turbomaquinas.POJO.comercial.FacturaFinalVista;

public class FacturaFinalVistaRM implements RowMapper<FacturaFinalVista>{

	@Override
	public FacturaFinalVista mapRow(ResultSet rs, int i) throws SQLException {
		
		FacturaFinalVista ffv = new FacturaFinalVista();
		ffv.setId(rs.getInt("id"));
		ffv.setTipo(rs.getString("tipo"));
		ffv.setNumero(rs.getInt("numero"));
		ffv.setFecha_factura(rs.getDate("fecha_factura"));
		ffv.setFecha_vencimiento(rs.getDate("fecha_vencimiento"));
		ffv.setSubtotal(rs.getFloat("subtotal"));
		ffv.setDescuento(rs.getFloat("descuento"));
		ffv.setIva(rs.getFloat("iva"));
		ffv.setIva_retenido(rs.getFloat("iva_retenido"));
		ffv.setTotal(rs.getFloat("total"));
		ffv.setTipo_cambio(rs.getFloat("tipo_cambio"));
		ffv.setMoneda(rs.getString("moneda"));
		ffv.setCondiciones_pago(rs.getString("condiciones_pago"));
		ffv.setSaldo(rs.getFloat("saldo"));
		ffv.setFolio_fiscal(rs.getString("folio_fiscal"));
		ffv.setCve_formap(rs.getString("cve_formap"));
		ffv.setDes_formap(rs.getString("des_formap"));
		ffv.setCve_metodop(rs.getString("cve_metodop"));
		ffv.setDes_metodop(rs.getString("des_metodop"));
		ffv.setCve_uso(rs.getString("cve_uso"));
		ffv.setDes_uso(rs.getString("des_uso"));
		ffv.setNumero_cliente(rs.getInt("numero_cliente"));
		ffv.setNombre(rs.getString("nombre"));
		ffv.setDireccion(rs.getString("direccion"));
		ffv.setColonia(rs.getString("colonia"));
		ffv.setCodigo_postal(rs.getString("codigo_postal"));
		ffv.setCiudad(rs.getString("ciudad"));
		ffv.setEstado(rs.getString("estado"));
		ffv.setPais(rs.getString("pais"));
		ffv.setActivo(rs.getInt("activo"));
		ffv.setFactura_final_id_sust(rs.getInt("factura_final_id_sust"));
		ffv.setFolio_fiscal_sust(rs.getString("folio_fiscal_sust"));
		ffv.setCLIENTES_id(rs.getInt("CLIENTES_id"));
		ffv.setEstado_factura(rs.getString("estado_factura"));
		return ffv;
	}

}
