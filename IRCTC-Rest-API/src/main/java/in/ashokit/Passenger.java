package in.ashokit;

public class Passenger {
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private Integer trainno;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Integer getTrainno() {
		return trainno;
	}
	public void setTrainno(Integer trainno) {
		this.trainno = trainno;
	}
	public Passenger(String name, String email, String doj, String from, String to, Integer trainno) {
		super();
		this.name = name;
		this.email = email;
		this.doj = doj;
		this.from = from;
		this.to = to;
		this.trainno = trainno;
	}
	public Passenger() {
		super();
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", trainno=" + trainno + "]";
	}

}

