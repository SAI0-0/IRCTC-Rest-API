
package in.ashokit;

public class Ticket {
	private Integer ticketno;
	private String name;
	private String doj;
	private String from;
	private String to;
	private Integer trainNum;
	private String status;
	
	public Integer getTicketno() {
		return ticketno;
	}
	public void setTicketno(Integer ticketno) {
		this.ticketno = ticketno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Integer getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(Integer trainNum) {
		this.trainNum = trainNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Ticket(Integer ticketno, String name, String doj, String from, String to, Integer trainNum, String status) {
		super();
		this.ticketno = ticketno;
		this.name = name;
		this.doj = doj;
		this.from = from;
		this.to = to;
		this.trainNum = trainNum;
		this.status = status;
	}
	public Ticket() {
		super();
	}
	@Override
	public String toString() {
		return "Ticket [ticketno=" + ticketno + ", name=" + name + ", doj=" + doj + ", from=" + from + ", to=" + to
				+ ", trainNum=" + trainNum + ", status=" + status + "]";
	}
	
}
