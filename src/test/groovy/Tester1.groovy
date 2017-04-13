/**
 * Created by ishwar on 21/3/17.
 */
import spock.lang.Specification;
import spock.lang.Unroll;

class Tester1 extends Specification {

    @Unroll
    void testFindUniqueChars() {

        expect:
        Question1 q = new Question1();
        q.findUniqueChars(str) == expectedResult

        where:

        str      | expectedResult
        "ishwar" | 6
        "aaaaa"  | 1
        "aqwa"   | 3
      //  "ankur"  | 4
    }

}
