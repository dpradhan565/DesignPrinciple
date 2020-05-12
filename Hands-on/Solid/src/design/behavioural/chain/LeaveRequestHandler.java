package design.behavioural.chain;

public interface LeaveRequestHandler {
	public void setNextChain( LeaveRequestHandler nextHandler);
	public void handlerRequest(LeaveRequest request);

}
