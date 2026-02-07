package com.cursojava.util;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.MaskFormatter;

public class FechaUtil {
	
	private static final DateTimeFormatter FORMATO_FECHA = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private static final DateTimeFormatter FORMATO_HORA = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	private static final DateTimeFormatter FORMATO_FECHA_HORA = DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss");
	
	// Mascara de Formato
	
	public static MaskFormatter getFormatoFecha() {
		try {
			MaskFormatter formatter = new MaskFormatter("##/##/####");
			formatter.setPlaceholderCharacter('_');
			return formatter;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static MaskFormatter getFormatoHora() {
		try {
			MaskFormatter formatter = new MaskFormatter("##:##");
			formatter.setPlaceholderCharacter('_');
			return formatter;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static MaskFormatter getFormatoFechaHora() {
		try {
			MaskFormatter formatter = new MaskFormatter("##/##/#### ##:##");
			formatter.setPlaceholderCharacter('_');
			return formatter;
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	
	//========== Localdate a String =====================
	
	public static String fechaAString(LocalDate fecha){
		return fecha.format(FORMATO_FECHA);
	}
	
	public static String horaAString(LocalTime fecha){
		return fecha.format(FORMATO_HORA);
	}
	
	public static String fechaHoraAString(LocalDateTime fecha){
		return fecha.format(FORMATO_FECHA_HORA);
	}
	
	//========== String a Localdate =====================
	
	public static LocalDate stringAFecha(String fecha) {
		try {
			return LocalDate.parse(fecha, FORMATO_FECHA);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static LocalTime stringAHora(String hora) {
		try {
			return LocalTime.parse(hora, FORMATO_HORA);
		} catch (Exception e) {
			return null;
		}
	}
	
	public static LocalDateTime stringAFechaHora(String fechaHora) {
		try {
			return LocalDateTime.parse(fechaHora, FORMATO_FECHA_HORA);
		} catch (Exception e) {
			return null;
		}
	}

}
