/**
  Represent a date
 */
public class Date implements Comparable {
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public int compareTo( Object otherObj) {
        return Double.compare( 
            ((Date)otherObj).doubleForm(),
            this.doubleForm());
    }

    public double doubleForm() {
        return y + 0.01 * m + 0.0001 * d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

}