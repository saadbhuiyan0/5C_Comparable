/**
  exercise Comparable types
 */

public class UserOfComparability {

    public static void main(String[] commandLine) {
        System.out.println( System.lineSeparator()
                          + "Point comparisons");

        // Point vs. itself
        Point p0 = new Point( 3., 4.);
        reportRelationship( "Point vs. itself", p0, p0, "0");

        // Point vs. its reflection about y = x
        reportRelationship( "Point vs. its reflection about y = x"
                          , p0, new Point( 4., 3.), "0");

        // Point vs. point closer to origin
        reportRelationship( "Point vs. point closer to origin", p0
                          , new Point( 1., 2.), "positive int");

        // Point vs. distant point
        reportRelationship( "Point vs. distant point", p0
                          , new Point( 100., 2.), "negative int");
        System.out.println( "---- end of Point comparisons ----");
        
        System.out.println( System.lineSeparator()
                          + "Date comparisons");

        // Date vs. itself
        Date d0 = new Date( 2019, 04, 04);
        reportRelationship( "Date vs. itself", d0, d0, "0");

        // Date vs. date in one day
        reportRelationship( "Date vs. date in one day"
                          , d0, new Date( 2019, 04, 05), "positive");

        // Date vs. date in one month
        reportRelationship( "Date vs. date in one month", d0
                          , new Date( 2019, 05, 04), "positive int");

        // Date vs. date in one year
        reportRelationship( "Date vs. date in one year", d0
                          , new Date( 2020, 04, 04), "positive int");

        // Date vs. date one day ago
        reportRelationship( "Date vs. date one day ago", d0
                          , new Date( 2019, 04, 03), "negative int");
        
        // Date vs. date one month ago
        reportRelationship( "Date vs. date one month ago", d0
                          , new Date( 2019, 03, 04), "negative int");

        // Date vs. date one year ago
        reportRelationship( "Date vs. date one year ago", d0
                          , new Date( 2018, 04, 04), "negative int");
        System.out.println( "---- end of Date comparisons ----");


        // reportRelationship( "IncomparableDog(s)"
        //                   , new IncomparableDog(), new IncomparableDog(),
        //                   "compiler error");
        
        // reportRelationship( "Point vs. Date", p0, d0, "runtime error");
    }


    /**
      Print the results of comparing two entities.
     */
    private static void reportRelationship 
      ( String description
      , Comparable a
      , Comparable b
      , String expect
      ) {
        System.out.println( description);

        // check 
        System.out.println(
            a + " compareTo " + b + ": "
          + a.compareTo( b)
            /* eventually expecting a compiler warning: 
              warning: [unchecked] unchecked call to compareTo(T) as a member of the raw type Comparable
              where T is a type-variable:
                T extends Object declared in interface Comparable
             */
          
          + " ...expecting " + expect
          + System.lineSeparator());
     }
}