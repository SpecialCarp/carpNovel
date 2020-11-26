package top.special.util.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConvert implements Converter<String, Date> {

	private String datePattern = "yyyy-MM-dd HH:mm:ss";
	
	public Date convert(String source) {
		SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
		Date day = null;
		try {
			day = sdf.parse(source);
		} catch (ParseException e) {
			throw new IllegalArgumentException("格式错误");
		}
		return day;
	}

}
