package soundSystem;

public class Music {

    private String pop;
    private Integer duration;

    public Music() {
        System.out.println("Constructor of Music without parameters. " + this.toString());
    }

    public Music(String pop, Integer duration) {
        this.pop = pop;
        this.duration = duration;
        System.out.println("Constructor of Music with 2 parameters. " + this.toString());
    }

    public String getPop() {
        System.out.println("get the pop value: " + pop + this.toString() );
        return pop;
    }

    public Integer getDuration() {
        System.out.println("get the duration value: " + duration);
        return duration;
    }

    public void setPop(String pop) {
        System.out.println("set the value of pop: " + pop + this.toString() );
        this.pop = pop;
    }

    public void setDuration(Integer duration) {
        System.out.println("set the value of duration: " + duration+ this.toString() );
        this.duration = duration;
    }
}
