

public class activityproblem {
	
	 private String activity;
	    private int start;
	    private int finish;

	    public activityproblem(String activity, int start, int finish) {
	        this.activity = activity;
	        this.start = start;
	        this.finish = finish;
	    }

	    public String getActivity() {
	        return activity;
	    }

	    public int getStart() {
	        return start;
	    }

	    public int getFinish() {
	        return finish;
	    }

	    @Override
	    public String toString() {
	        return activity + " [" + start + ", " + finish + "]";
	    }

}




