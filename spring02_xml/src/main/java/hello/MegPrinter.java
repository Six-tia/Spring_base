package hello;

public class MegPrinter {

    public MegPrinter() {
        System.out.println("MsgPrinter...");
    }

    private MsgService msgService;

    public void setMsgService(MsgService service){
        msgService = service;
    }

    public void printMessage(){
        System.out.println(msgService.getMessage());
    }

}
