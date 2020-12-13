import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

class Log {
	private Long StartLog;
	private Long EndLog;

	Log(Long StartLog, Long EndLog) {
		this.StartLog = StartLog;
		this.EndLog = EndLog;
	}

	public Long getStartLog() {
		return StartLog;
	}
	public Long getEndLog() {
		return EndLog;
	}
}

public class ChoosukSolution {

	public static int solution(String[] lines) {
		// TODO Auto-generated method stub
		String[] s = new String[lines.length];
		String[] sToMil = new String[lines.length];
		String[] tToMil = new String[lines.length];
		List<Log> list = new LinkedList<>();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		for (int i = 0; i < lines.length; i++) {
			String[] buff = lines[i].split(" ");
			s[i] = buff[0] + " " + buff[1];
			tToMil[i] = buff[2].replace("s", "");
			try {
				Date sfd = sf.parse(s[i]);
				sToMil[i] = Long.toString(sfd.getTime());
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Long StartTime = (long) (Long.parseLong(sToMil[i]) - (Double.parseDouble(tToMil[i]) * 1000));
			Long EndTime = Long.parseLong(sToMil[i]);
			list.add(new Log(StartTime, EndTime));
		}
		int maxCounter = 0;
		for(Log logbasic : list) {
			for(long i = logbasic.getStartLog(); i <= logbasic.getEndLog(); i++) {
				long StartScope = i-999;
				long EndScope = i;
				int currentCounter = 0;
				for (Log log : list) {
					if (StartScope > log.getStartLog()) {
						if (log.getEndLog() >= StartScope) {
							currentCounter++;
						}
					} else {
						if (EndScope > log.getStartLog()) {
							currentCounter++;
						}
					}
				}
				if (currentCounter > maxCounter) {
					maxCounter = currentCounter;
				}
			}
		}
		return maxCounter;
	}
}
