import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Date currentTime = new Date();

		final SimpleDateFormat sdf =
		        new SimpleDateFormat("EEE, d MMM yyyy hh:mm:ss z");

		// Give it to me in GMT time.
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println(sdf.format(currentTime));
	}
}
