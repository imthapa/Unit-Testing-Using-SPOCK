package coreJavaTest

import coreJavaTesting.Question2
import coreJavaTesting.Question3
import spock.lang.IgnoreRest
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by ishwar on 21/3/17.
 */
class Question3Test extends Specification {
    Question3 question3;
    // int expectedResult;
    Character a;

    void setup() {
        question3 = new Question3();

    }

    @Unroll
    def "happyCounterTest"() {

        expect:
        Question3.counter(a, str) == expectedResult;

        where:
        a   | str      | expectedResult
        "a" | "ishwar" | 1
        "s" | "shyams" | 2
        "s" | "ssssss" | 6

    }

    @Unroll
    def "sadCounterTest"() {
        expect:
        Question3.counter(a, str) == expectedResult;

        where:
        a    | str      | expectedResult
        "b"  | "ishwar" | 0
        "s"  | ""       | 0
        "\0" | "ssdsds" | 0
        "d"  | "zzzzzz" | 0
    }
}
