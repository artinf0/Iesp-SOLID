package br.com.iesp.mba.solid.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DataUtils {
	
	public static String formatarData(Date data) {
		return formatarData(data, "dd/MM/yyyy hh:mm");
	}

	public static String formatarData(Date data, String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		return simpleDateFormat.format(data);
	}
	
}
