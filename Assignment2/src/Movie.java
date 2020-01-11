
public class Movie {
	
	private int iD;
	private String name ;
	private String showdate;
	private String showtime;
	private String status;
	
	public Movie()
	{
		
	}

	public Movie(int iD, String name, String showdate, String showtime, String status) {
		super();
		this.iD = iD;
		this.name = name;
		this.showdate = showdate;
		this.showtime = showtime;
		this.status = status;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShowdate() {
		return showdate;
	}

	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	@Override
	public String toString() {
		return "Movie [iD=" + iD + ", name=" + name + ", showdate=" + showdate + ", showtime=" + showtime + ", status="
				+ status + "]";
	}
	
	
}
