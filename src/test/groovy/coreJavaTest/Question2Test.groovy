package coreJavaTest


import coreJavaTesting.Question2
import spock.lang.Specification
import spock.lang.Unroll

/**
 * Created by ishwar on 21/3/17.
 */
class Question2Test extends Specification {

    Question2 question2;
    String[] arr;

    void setup() {
        question2 = new Question2();
    }

    @Unroll
    void testDuplicacy() {

        expect:
        question2.duplicateWords(arr) == expextedOutput;
        where:
        arr                                                        | expextedOutput
        ["ishwar", "mani", "thapa", "is", "my", "name,", "ishwar"] | [is: 1, ishwar: 2, "name,": 1, mani: 1, my: 1, thapa: 1]
        ["ishwar", "mani", "name", "is", "my", "name", "ishwar"]   | [is: 1, ishwar: 2, "name": 2, mani: 1, my: 1]
        []                                                         | [:]
        ["ishwar"]                                                 | [ishwar: 1]

    }
}
